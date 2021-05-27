
package instancevariables;

public class Instancevariables {
    public int i=10;
    
 public static void main(String[] args) {
     Instancevariables p=new Instancevariables();
     System.out.println(p.i);       
    }
}
//We cannot directly access the instance variables within a static method because a static method can only access static variables or static methods.

//An instance variable, as the name suggests is tied to an instance of a class