using System;
 
class EvenOdd
{
 
    static void Main(string[] args)
    {
 
        int num;
        Console.Write("Enter number: ");
        num = Convert.ToInt32(Console.ReadLine());
        switch (num % 2)
        {
            case 0: Console.WriteLine(num+" is even number");
                break;
            case 1: Console.WriteLine(num +" is odd number");
                break;
        }
        Console.ReadLine();
    }
}