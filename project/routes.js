const express = require('express'); 

function eRoutes() {
    const router = express.Router();
    var employee = require('./repository/employee/employee.routes')(router);
    return router;
}

module.exports = eRoutes;