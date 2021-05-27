package employee;
public class Employee
{   
    public String empName;
    public int empSalary;
    public String address;

    public Employee()
    {
    	
        this("akhi");
    }

    public Employee(String name)
    {
    	
    	this(name, 12000);
    }
    public Employee(String name, int sal)
    {
    	
    	this(name, sal, "Vijayawada");
    }
    public Employee(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void disp() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.disp();
    }
}