
package logicaloperators;


public class LogicalOperators {

    
    public static void main(String[] args) {
        
     int a=10,b=30,c=30,d = 0;
     
     System.out.println("a value = " + a);
     System.out.println("b value = " + b);
     System.out.println("c value = " + c);
     if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
     else
            System.out.println("False conditions");
     if ((a < b) || (b == c)) {
            System.out.println("One or both" + " the conditions are true");
        }
     else{
         System.out.println("conditions are false");
     }
        System.out.println("!(a < b) = " + !(a < b)); 
        System.out.println("!(a > b) = " + !(a > b));
     
     
    }
    
}
