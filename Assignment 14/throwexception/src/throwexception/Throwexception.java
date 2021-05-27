
package throwexception;


public class Throwexception {
static void valid(int age){  
     if(age<18)  
      throw new ArithmeticException("not valid");  
     else  
      System.out.println("welcome to vote");  
   }  

    public static void main(String[] args) {
        valid(14);//error 
        
    }
    
}
