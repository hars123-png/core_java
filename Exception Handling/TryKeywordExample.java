public class TryKeywordExample {
    public static void main(String[] args) {
        try {

            int a = 10;
            int b = 0;  
            int result = a / b;
            System.out.println( result);
        }
         catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
 }
        catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }

        System.out.println("Program continues after the try-catch block."); 
    }
}