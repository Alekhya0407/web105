using System;
 
class Numbers
{
public static void Main()
{
    // variable declaration
    int n1 = 10, n2 = 20, n3 = 30, max;
     
    // Largest among n1 and n2
    max = (n1 > n2 && n1 > n2) ?
                n1 : (n2 > n3) ? n2 : n3;
     
    // Print the largest number
    Console.WriteLine("Largest number among " +
                     n1 + ", " + n2 + " and " +
                            n3 + " is " + max);
}
}