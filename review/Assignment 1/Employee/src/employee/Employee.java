
package employee;
public class Employee { //creation of classes
    String name;
    String emailAddress;
    int yearOfBirth;
    public void  m1(int i){  //creation of method signature    
    } 
    public static void main(String[] args) {
        Employee e1 = new Employee(); //creation of objects
        e1.name = "akhi";
        e1.emailAddress = "akhi@company.com";
        e1.yearOfBirth = 1974;
         printEmployee(e1);
         Employee e2=new Employee();
         e2.m1(10);
    }
    static void printEmployee(Employee e) { //creation of methods
        System.out.println("Name: " + e.name);
        System.out.println("Email Address: " + e.emailAddress);
        System.out.println("Year Of Birth: " + e.yearOfBirth);
    }
    
}
