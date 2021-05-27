
package ae;


public class AE {

    
    public static void main(String[] args) {
         try {
      int a= 50/0;
       System.out.println("You are not dividing a number by 0");
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception: cannot divide by 0");
    }
    }
    
}
