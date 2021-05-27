interface Bike
{
   int Avgspeed = 40;
   void move();
}
class Vehicle implements Bike
{
  public void move()
  {
    System.out.println("average speed"+Avgspeed);
   }
  public static void main(String args[])
   {
    Vehicle vc = new Vehicle();
    vc.move();
   }
} 