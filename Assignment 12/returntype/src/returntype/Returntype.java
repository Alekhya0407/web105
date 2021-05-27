
package returntype;


public class Returntype {
    int square(int num){
	return num * num;
    }

public static void main(String[] args) {
        Returntype i=new Returntype();
        int squareOfNumber = i.square(50);
        System.out.println("Square of 50: " +squareOfNumber);
    }
    
}
