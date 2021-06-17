using System;
public class Even
{
  public static void Main(String[] args)
  {
     int i=0;
	 Console.WriteLine("Even Numbers :");
            for (i = 10; i <= 100; i++)
            {   
                if( i%2 == 0 )
                {
                    Console.Write(i + " ");
                }
            }
			Console.WriteLine();
			}
		}