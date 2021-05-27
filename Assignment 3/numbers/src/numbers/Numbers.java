
package numbers;

import java.util.Scanner;


public class Numbers {

    
    public static void main(String[] args) {
        int n;
        System.out.println("enter a number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("entered number is even");
        }
        else
        {
            System.out.println("entered number is odd");
        }
        
        
        
    }
    
}
