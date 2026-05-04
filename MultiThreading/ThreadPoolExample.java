import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}



public class ThreadPoolExample {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(3);
        for(int i=0; i<10; i++){
            executor.execute(new Task());
        }
            ((ExecutorService) executor).shutdown();
    }
    }
    
