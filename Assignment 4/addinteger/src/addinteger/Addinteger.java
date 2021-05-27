
package addinteger;

import java.util.Arrays;
import java.util.Scanner;


public class Addinteger {

   
    public static void main(String[] args) {
        System.out.println("enter the required size of array:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int Array[]=new int[n];
        int sum=0;
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++)
        {
            Array[i]=s.nextInt();
            sum = sum+Array[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(Array));
      System.out.println("Sum of the elements of the array:"+sum);
        
    }
    
}
