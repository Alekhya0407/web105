using System;  
  public class PrimeNumber
   {  
     public static void Main(string[] args)  
      {  
          int n, i, m=0, l=0;    
          Console.Write("Enter the Number to check Prime: ");    
          n = int.Parse(Console.ReadLine());  
          m=n/2;    
          for(i = 2; i <= m; i++)    
          {    
           if(n % i == 0)    
            {    
             Console.Write("Not a Prime Number");    
             l=1;    
             break;    
            }    
          }    
          if (l==0)    
           Console.Write("Number is Prime.");       
     }  
   }  