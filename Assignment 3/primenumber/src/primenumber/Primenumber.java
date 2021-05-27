
package primenumber;

public class Primenumber {

    
    public static void main(String[] args) {
        int n=17,temp;
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++)
        {
            temp=n%i;
            if(temp==0)
            {
                isPrime=false;
                break;
                
            }
            
        }
        if(isPrime)
        {
            System.out.println(n + "is a prime number");
        }
        else
            System.out.println(n + "is not a prime number");
    }
    
}
