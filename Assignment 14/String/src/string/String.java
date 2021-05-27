
package string;


public class String {

    
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char charAtNegativeIndex = str.charAt(-1);
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught"); // the exception will occur
            e.printStackTrace();
        }
    }
    
}
