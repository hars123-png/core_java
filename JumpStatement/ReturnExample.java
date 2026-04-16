public class ReturnExample {
    public static void checknumber(int num) {
        
        if(num <0){
            System.out.println("Negative number");
            return; // Exit the method if the number is negative
        }
        System.out.println("Positive number");
    }
        

            public static void main(String[] args) {
                checknumber(-5); // Output: Negative number
                checknumber(10); // Output: Positive number
            }

            
        
    }

    
