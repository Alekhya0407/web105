using System;
public class OddEven
{
   public static void Main(String[] args)
   {
      int n,r;
	  Console.WrtieLine("enter number");
	  n=Convert.ToInt32(Console.ReadLine()); 
	  r=n%2;
	  if(r == 0)
	  {
	    Console.WriteLine("it is even number",n);
	  }
	  else
	  {
	    Console.WriteLine("it is odd number",n);
	  }
	}
}