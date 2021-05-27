
package insertelement;

import java.util.Scanner;


public class Insertelement {

    
    public static void main(String[] args) {
                int n, pos, p; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        n = s.nextInt();
        int a[] = new int[n+1];

        System.out.println("Enter  elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        System.out.print("Enter the position  you want to insert element:");

        pos = s.nextInt();

        System.out.print("Enter the element you want to insert:");

        p = s.nextInt();

        for(int i = (n-1); i >= (pos-1); i--)

        {

            a[i+1] = a[i];

        }

        a[pos-1] = p;

        System.out.print("After inserting:\n");

        for(int i = 0; i < n; i++)

        {

            System.out.print(a[i]+",");

        }

        System.out.print(a[n]);
    }
    
}
