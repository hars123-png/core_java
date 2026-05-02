class Demo{

    Demo(){
        System.out.println("constructor is called");
    }
    @Override
 protected void finalize() throws Throwable{
        System.out.println("finalize method is called");
    }

}

public class main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo = null;    
        System.gc();
        
    }
}