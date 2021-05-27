
package switchprogram;

import java.util.Scanner;

public class Switchprogram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        switch(n%2){
            case 0:
                System.out.println(n+ " is a even number");
                break;
            case 1:
                System.out.println(n+ " is a odd number");
        }
        
    }
    
}
