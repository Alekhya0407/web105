import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class BW {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer); //same as bufferreader
 
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("bye!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}