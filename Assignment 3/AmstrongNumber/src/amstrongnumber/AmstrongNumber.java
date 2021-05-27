
package amstrongnumber;


public class AmstrongNumber {

    public static void main(String[] args) {
      int d=0,r,p;
      int n=153;
      p=n;
      while(n>0)
      {
          r=n%10;
          n=n/10;
          d=d+(r*r*r);
      }
      if(p==d)
      {
          System.out.println("amstrong number");
      }
      else
      {
          System.out.println("Not an amstrong number");
      }
    }
}
