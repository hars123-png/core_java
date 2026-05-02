public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
        int arr[] = {10, 20, 30};
        //outer try risky code
        System.out.println(arr[3]);

        try {
            //inner try risky code
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException in inner try: " + e.getMessage());
        }
    }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException in outer try: " + e.getMessage());
        }
       

        System.out.println("Program continues after the nested try-catch blocks.");
    }
    
}
