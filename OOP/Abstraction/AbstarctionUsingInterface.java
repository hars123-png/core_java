interface Vehicles{
    void start();
    void stop();
}

class car implements Vehicles{
    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }
}

class bike implements Vehicles{
    public void start(){
        System.out.println("Bike is starting");
    }
    public void stop(){
        System.out.println("Bike is stopping");
    }
}

public class AbstarctionUsingInterface {
    public static void main(String[] args) {
        car car = new car();
        car.start();
        car.stop();

        bike bike = new bike();
        bike.start();
        bike.stop();
    }
}