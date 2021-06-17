using System;
public class Maximum
{
  public static void Main(String[] args)
  {
     int n1,n2,n3;
	 n1=10;
	 n2=20;
	 n3=30;
	 if(n1>n2){
	 if(n1>n3){
	 Console.Write("10 is the largest number\n");
            }
			else {
               Console.Write("30 is the largest number\n");
         }
      }
      else if (n2>n3)
         Console.Write("20 is the largest number\n");
      else
         Console.Write(" 30 is the largest number\n");
      }
   }