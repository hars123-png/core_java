public class WrapperExample {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        
        // String str = "123";
        // int parsedInt = Integer.parseInt(str); // Unboxing      
        // System.out.println("Parsed int from String: " + parsedInt);

        Integer a =100;
        Integer b= 100;
        System.out.println("a == b: " + (a == b) ); // true, because of Integer caching
        System.out.println("a.equals(b): " + a.equals(b)); // true, because values are equal   
        
        double d = 99.99;
        int num1= (int) d; // Explicit casting
        System.out.println(num1); // Output: 99
}
}