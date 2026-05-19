import java.util.regex.Matcher;
import java.util.regex.Pattern;     

public class RegexExample {
    public static void main(String[] args) {
       Pattern pattern = Pattern.compile("\\d+");
         Matcher matcher = pattern.matcher("12345");

         if(matcher.matches()) {
             System.out.println("The string is a valid number.");
         } else {
             System.out.println("The string is not a valid number.");
         }
    }
}