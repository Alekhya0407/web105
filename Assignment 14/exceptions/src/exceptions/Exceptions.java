
package exceptions;


public class Exceptions {

    public static void main(String[] args) {
      try{
        int a[]=new int[10];
        a[11] = 9;
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
      catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }      
    }
    
}
