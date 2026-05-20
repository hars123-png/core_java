import java.io.IOException;
import java.io.FileOutputStream;

public class AppendExample{
    public static void main(String[]args){
        try{
            FileOutputStream fos = new  FileOutputStream ("demo.txt");
            String text = "\nThis line is appended.";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Data appended sucessfully");

        }
        catch(IOException e){
            System.out.println(e.getMessage());
            
        }
    }
}