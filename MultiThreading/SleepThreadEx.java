public class SleepThreadEx {
    public static void main(String[] args) {
        try{
            System.out.println("Progarm Started ");
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Program resumed after sleep");
        }
         catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
