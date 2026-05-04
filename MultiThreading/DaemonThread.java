class MyThread extends Thread{
    
    public void run() {
       if(Thread.currentThread().isDaemon()){
        System.out.println("Daemon Thread is running");
       }
       else{
        System.out.println("User Thread is running");
       }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setDaemon(true); // Set t1 as a daemon thread
        t1.start();
        t2.start();
    }
}