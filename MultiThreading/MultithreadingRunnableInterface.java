class MyTask implements Runnable{

    public void run(){
    System.out.println("Thread using Runnable");

    }
}

public class MultithreadingRunnableInterface {
    public static void main(String[] args) {
      // Step 1: create Runnable Object
      // Runnable task = new MyTask();

      MyTask task = new MyTask();

      // step 2: create Thread object and pass Runnable Object
      Thread t1 = new Thread(task, "FCT Thread");

      // step 3: start the thread
      t1.start();
      System.out.println(t1.getName());

    }
}
