using System;
 
class Gender
{
 
    static void Main(string[] args)
    {
 
        char gender;
        Console.WriteLine("Enter gender (M/m or F/f): ");
        gender = Convert.ToChar(Console.ReadLine());
        switch (gender)
        {
            case 'M':
            case 'm': Console.WriteLine("MALE");
            break;
 
            case 'F':
            case 'f': Console.WriteLine("FEMALE");
            break;
 
            default: Console.WriteLine("Notspecified Gender");
                break;
        }
 
        Console.ReadLine();
 
    }
 
}