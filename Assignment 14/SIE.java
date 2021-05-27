import java.util.*;  
public class SIE {    
    public static void main(String[] args) {  
         
          Scanner scan = new Scanner("Hello World! Hello JavaTpoint.");  
          
          System.out.println("" + scan.nextLine());  
          System.out.println("Exception Output: " + scan.ioException());  
          scan.close();   
    }  
}  