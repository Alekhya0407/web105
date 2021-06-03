CREATE TABLE [dbo].[Tbl_Department] (
[Id] INT IDENTITY (1, 1) NOT NULL,
[Name] VARCHAR (50) NOT NULL,
PRIMARY KEY CLUSTERED ([Id] ASC)
);
GO;
CREATE TABLE [dbo].[Tbl_Employee] (
    [Id]          INT          IDENTITY (1, 1) NOT NULL,
    [FirstName]   VARCHAR (50) NOT NULL,
    [LastName]    VARCHAR (50) NOT NULL,
    [Skills] VARCHAR (50) NOT NULL,
    [MobileNumber]      INT          NULL,
    PRIMARY KEY CLUSTERED ([Id] ASC)
);
GO;
CREATE PROCEDURE [dbo].GetEmployees 
 
AS
 SELECT * from Tbl_Employee
 
GO;
CREATE PROCEDURE [dbo].InsertOrUpdateEmployee
 @FirstName varchar(50),
 @MiddleName varchar(50),
 @LastName varchar(50),
 @Skills varchar(50),
 @MobileNumber int,
 @Id int = 0
as
BEGIN
 if (@Id = 0) 
  INSERT INTO [dbo].[Tbl_Employee] ([FirstName], [MiddleName], [LastName], [Skills],[MobileNumber]) 
  VALUES (@FirstName,@MiddleName, @LastName, @Skills ,@MobileNumber)
 else
  update [Tbl_Employee] set [FirstName] = @FirstName, [MiddleName] = @MiddleName, [LastName]=@LastName, [Skills]=@Skills, [MobileNumber]=@MobileNumber
  where Id = @Id
 end
END
 
AS
 SELECT * from Tbl_Employee
 

-----
app.js

var express = require('express');
var bodyParser = require('body-parser');
var app = express();
var port = process.env.port || 3300
app.listen(port, () => {
    console.log("Hi This port is running");
});
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
var router = require('./routes')();
 
app.use('/api', router);
------
npm install express
npm install body-parser
-------
var Connection = require('tedious').Connection;
var config = {
    server: '#######',
    authentication: {
        type: 'default',
        options: {
            userName: 'jala',
            password: '####'
        }
    },
    options: {
        database: '###',
        instanceName: 'Sqlexpress',
        rowCollectionOnDone: true,
        useColumnNames: false
    }
}
var connection = new Connection(config);
connection.on('connect', function (err) {
    if (err) {
        console.log(err);
    } else {
        console.log('Connected');
    }
});
module.exports = connection;
------
getmethod:

var Request = require('tedious').Request;
var connection = require('./connect');
var utility = require('./utility/utility');
function spGetExecute(qry, callback) {
    var data = [];
    var dataset = [];
    var resultset = 0;
    request = new Request(qry, function (err, rowCount) {
        utility.sendDbResponse(err, rowCount, dataset, callback);
});
request.on('row', function (columns) {
        utility.buildRow(columns, data);
});
request.on('doneInProc', function (rowCount, more, rows) {
        dataset.push(data);
        data = [];
    });
connection.callProcedure(request);
}
module.exports = {
    get: spGetExecute 
};
--------
post method :

function spPostExecute(qry, params, callback) {
    var newdata = [];
request = new Request(qry, function (err, rowCount) {
        utility.sendDbResponse(err, rowCount, newdata, callback);
    });
params.forEach(param => {
request.addParameter(param.name, param.type, param.val);
});
request.on('row', function (columns) {
        utility.buildRow(columns, newdata);
    });
connection.callProcedure(request);
}
----------
module.exports = {
    get: spGetExecute,
    post: spPostExecute
};
--------
var response = require('../../shared/response');
var TYPES = require('tedious').TYPES;
function EmployeeRepository(dbContext) {
function getEmployees(req, res) {
dbContext.get("getEmployee", function (error, data) {
                return res.json(response(data, error));
            });
}
function getEmployee(req, res) {
       if (req.params.employeeId) {
            var parameters = [];
parameters.push({ name: 'Id', type: TYPES.Int, val: req.params.employeeId });
var query = "select * from tbl_employee where Id = @Id"
dbContext.getQuery(query, parameters, false, function (error, data) {
                if (data) {
                    req.data = data[0];
                    return next();
                }
                return res.sendStatus(404);
            });
        }
    }
function postEmployees(req, res) {
var parameters = [];
parameters.push({ name: 'FirstName', type: TYPES.VarChar, val: req.body.FirstName });
        parameters.push({ name: 'LastName', type: TYPES.VarChar, val: req.body.LastName });
        parameters.push({ name: 'Skills', type: TYPES.VarChar, val: req.body.Skills });
        parameters.push({ name: 'MobileNumber', type: TYPES.Int, val: req.body.MobileNumber });
dbContext.post("InsertOrUpdateEmployee", parameters, function (error, data) {
            return res.json(response(data, error));
        });
    }
return {
        getAll: getEmployees,
        get: getEmployee,
        post: postEmployees 
    }
}
module.exports = EmployeeRepository;
---------
api reference :

const _employeeRepository = require('./employee.respository');
const dbContext = require('../../Database/dbContext');
module.exports = function (router) {
    const employeeRepository = _employeeRepository(dbContext);
router.route('/employees')
        .get(employeeRepository.getAll)
        .post(employeeRepository.post);
    .get(employeeRepository.getMulti);
router.use('/employees/:employeeId', employeeRepository.intercept);
router.route('/employees/:employeeId')
        .get(employeeRepository.get)
        .put(employeeRepository.put)
        .delete(employeeRepository.delete);
}
----------
const express = require('express');
function eRoutes() {
    const router = express.Router();
    var employee = require('./repository/employee/employee.routes')(router);
    return router;
}
module.exports = eRoutes;
------
run :
node app.js