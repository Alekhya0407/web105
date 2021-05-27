
package equalornot;

import java.util.Scanner;


public class EqualOrNot {

    
    public static void main(String[] args) {
                int a,b;

         Scanner s = new Scanner(System.in);

        System.out.print("first value:");

        a = s.nextInt();

        System.out.print("second value:");

        b = s.nextInt();

        if(a == b)

        {
            System.out.println(a+" and "+b+" are equal ");

        }

        else

        {
            System.out.println(a+" and "+b+" are not equal ");

        }
    }
    
}
