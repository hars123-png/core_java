class Mythread1 extends Thread{
    public void run(){
       for (int i = 1; i<=5; i++) {
        System.out.println("Task1:" +i);
       }
    }
}


class Mythread2 extends Thread{
    public void run(){
       for (int i = 1; i<=5; i++) {
        System.out.println("Task2:" +i);
       }
    }
}



public class MutitreadingEx {
    public static void main(String[] args) {


      Mythread1 t1 = new Mythread1();

      Mythread2 t2 = new Mythread2();
        
      t1.start();   
        t2.start();
        // CPU Scheluler will decide which thread to run first, so the output may be different each time we run the program.

        // Thread t2 = new Thread("FCT THread");
        // t2.start();
        // System.out.println("Thread name is: "+t2.getName());

        // //Naming Thread & Current Thread
        // Mythread t3 = new Mythread();

        // t3.setName("FCT Thread");
        // t3.start();
    }
}