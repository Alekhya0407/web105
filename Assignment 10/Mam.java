import java.io.*;
interface intA
{
   void m1();
}
interface intB
{
   void m2();
}
class Sample implements intA, intB
{
  public void m1()
  {
       System.out.println("welcome to m1");
   }
  public void m2()
   {
      System.out.println("welcome to m2");
   }
 }
class Mam
{
   public static void main(String args[])
    {
       Sample ob1=new Sample();
       ob1.m1();
       ob1.m2();
     }
}