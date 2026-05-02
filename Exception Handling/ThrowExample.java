public class ThrowExample {
    public static void main(String[] args) {
       int age =16;
       if (age < 18) {
        throw new ArithmeticException("Age must be at least 18 to vote.");
       }
       else {
        System.out.println("You are eligible to vote.");
       }
    }
}
