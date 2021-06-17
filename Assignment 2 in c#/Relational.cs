using System;
public class Relational
{
   public static void Main(String[] args)
   {
       int x = 11;
      if (x < 10) 
      {
        Console.WriteLine("x is less");
      } 
      else if (x > 20) 
      {
        Console.WriteLine("x is greater");
      }
	  else if (x >= 20) 
      {
        Console.WriteLine("x is greater or equal to ");
      } 
	  else if (x <= 20)
	  {
		  Console.WriteLine("x is less than or equal to");
	  }
      else 
      {
        Console.WriteLine("no option is correct");
      }
		}
}