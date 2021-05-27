
package catchblock;


public class Catchblock {

    
    public static void main(String[] args) {
       try{    
                int a[]=new int[3];    
                a[3]=10/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }  
               catch (NullPointerException e)
               {
                  System.out.println("Null pointer exception");
               }
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }
    
}
