
package exception;


public class Exception {

    
    public static void main(String[] args) {
        try{
            Class.forName("the class do not exist");
        }
        catch (ClassNotFoundException e)
       {
         e.printStackTrace();
          }
    }
    
}
