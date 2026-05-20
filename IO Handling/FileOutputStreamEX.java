import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEX {
    public static void main(String[] args) {
       try{
              FileOutputStream fos = new FileOutputStream("output.txt");
              
              String data = "Hello, harshada!";
              
              byte[] bytes = data.getBytes();
              
              fos.write(bytes);
              
              fos.close();
              //why close() is important?
              // 1 data may not fully written
              //12 resource leak can occur
              // 3 file corruption can occur
              // 4 file may stay locked
              System.out.println("Data written to file successfully.");
       } catch(IOException e){
           System.out.println("An error occurred: " + e.getMessage());
       }
    }
}