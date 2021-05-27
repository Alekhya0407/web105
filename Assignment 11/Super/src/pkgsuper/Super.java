
package pkgsuper;
class Superclass
{
   int num = 99;
}

public class Super extends Superclass{
    int num = 100;
    void printNumber(){
	System.out.println(num);
    }

    
    public static void main(String[] args) {
        Super obj= new Super();
	obj.printNumber();
        
    }
    
}
