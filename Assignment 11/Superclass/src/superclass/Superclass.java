
package superclass;
class Animal{  
String color="orange";  
}  
class Dog extends Animal{  
String color="white";  
void printColor(){  
System.out.println(color);
System.out.println(super.color); 
}  
}  


public class Superclass {
    public static void main(String[] args) {
        Dog d=new Dog();  
       d.printColor();  
        
    }
    
}
