class Outer{
    int x=10;
    class Inner{
        void display(){
            System.out.println("Value of x is: "+x);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}