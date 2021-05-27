
package palindrome;

import java.util.Scanner;


public class Palindrome {

    
    public static void main(String[] args) {
        int n,o,s,rem;
            Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   n=sc.nextInt();
	    o=n;
	    for(s=0;n>0;n=n/10)
	    {
	    rem=n%10;
	    s=(s*10)+rem;
	    }
	   if(s==o)
		System.out.println(o+" is a palindrome number ");
                  else
		System.out.println(o+" is not a palindrome number ");
    }
    
}
