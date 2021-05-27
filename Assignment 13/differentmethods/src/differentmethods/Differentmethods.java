
package differentmethods;

public class Differentmethods {

    public static void sayClassName(Object aObject) {
    System.out.println("sating the class name is object");
  }

  public static void sayClassName(String aString) {
    System.out.println("saying the class name is string");
  }
    public static void main(String[] args) {
    String aString = new String();//object creation
    sayClassName(aString);

    Object aObject = new String();
    sayClassName(aObject);
    }
    
}
