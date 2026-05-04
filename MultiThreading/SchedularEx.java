
class Schedular extends Thread {
   
    public void run() {
        for(int i=0; i<3; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}



public class SchedularEx {
    public static void main(String[] args) {
        Schedular t1 = new Schedular();
        Schedular t2 = new Schedular();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    
}
}
