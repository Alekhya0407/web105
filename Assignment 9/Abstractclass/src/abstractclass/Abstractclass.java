
package abstractclass;
abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void Gear(){System.out.println("gear changed");}  
 }  
 class Honda extends Bike{  
 @Override
 void run(){System.out.println("running safely..");}  
 } 
public class Abstractclass {
    
    public static void main(String[] args) {
        Bike obj = new Honda();  
  obj.run();  
  obj.Gear(); 
    }
    
}
