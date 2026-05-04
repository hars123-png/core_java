class MyThread extends Thread {
    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Thread Running: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        }
        catch (InterruptedException e) {
           System.out.println("e");
        }
    }
} 


public class SleepThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        // Mythread2 t1 = new Mythread2();
        // t1.start();
    }
}
