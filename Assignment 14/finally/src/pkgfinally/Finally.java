
package pkgfinally;


public class Finally {

    
    public static void main(String[] args) {
         try{  
   int d=10/5;  
   System.out.println(d);  
  }  
  catch(NullPointerException e)
  {
      System.out.println(e);
  }  
  finally
         {
             System.out.println("finally block is always executed");
         }
    }
    
}
