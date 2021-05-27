package bufferinput;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInput {

    public static void main(String[] args) {
         File file = new File("C://hello.txt");
        BufferedInputStream bis = null;
 
        try {
            FileInputStream fis = new FileInputStream(file);
 
            bis = new BufferedInputStream(fis); //same as bufferedoutput stream
 
            byte[] buffer = new byte[1024];
 
            int bytes = 0;
            String fC;
 
            while ((bytes = bis.read(buffer)) != -1) {
                fC = new String(buffer, 0, bytes);
                System.out.print(fC);
            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
 
        }
        
    }
    
}
