import java.io.FileReader;
import java.io.IOException;
 
public class FR {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("testout.txt"); //same as FileWriter
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
//FileWriter writer = new FileWriter("testout.txt", true);
            writer.write("Hello");
            writer.write("\r\n");   // write new line
            writer.write("Bye!");
            writer.close();