
// overloading example



class calculator{

    int add(int a,int b){
        return a+ b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }


}
 public class Addition{
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.add(2,4));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add (6,8,3));
    }

 }