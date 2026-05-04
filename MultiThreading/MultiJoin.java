class Task extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " Started");
        try{
            Thread.sleep(2000); // Sleep for 2 seconds
        }
        catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + " Finished");

    }
}

public class MultiJoin {
    public static void main(String[] args) throws Exception {
       Task t1 = new Task();
       Thread th1 = new Thread(t1, "FCT1");
         Task t2 = new Task();
         th1.start();
         th1.join(); // Wait for th1 to finish before starting th2
         t2.start();
         t2.join();
         System.out.println("All threads have finished execution"); 
    }
}