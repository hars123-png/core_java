 abstract class vehicles{
    int noofwheels;
    
    
    void displayTyre(){
        System.out.println("Car has" +noofwheels + "tyres");
    }  
     abstract void start();
}

class Car extends vehicles{
  
    void start(){
        noofwheels = 4;
        System.out.println("Car is starting");
    }
}
class Bike extends vehicles{
   
    void start(){
        noofwheels = 2;
        System.out.println("Bike is starting");
    }
}
   


public class WithoutAbstaction {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.displayTyre();

        Bike bike = new Bike();
        bike.start();
        bike.displayTyre();
    }
}
