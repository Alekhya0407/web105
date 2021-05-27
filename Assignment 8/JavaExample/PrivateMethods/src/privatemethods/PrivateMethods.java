
package privatemethods;
import java.lang.reflect.Method;  

/**
 *
 * @author new
 */
public class PrivateMethods {

    class A {    
  private void display()  
  {  
      System.out.println("private method is invoked");  
  }    
}      
    
    public static void main(String[] args)throws Exception{
        // TODO code application logic here
          Class c = Class.forName("A");    
    Object o= c.newInstance();    
    Method m =c.getDeclaredMethod("display", (Class) null);    
    m.setAccessible(true);    
    m.invoke(o, (Object) null);
    }
    
}
