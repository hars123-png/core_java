
class Shape{

    public void area (){
        System.out.println("dispaly Area")
    }

}

class Traingle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
 class Equalateral extends Traingle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }

public class single_inheritanceEX{

}