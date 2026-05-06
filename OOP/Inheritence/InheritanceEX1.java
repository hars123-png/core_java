class Animal {
    void Sound() {
        System.out.println("Making a sound...");
    }
}
// child class
class Dog extends Animal {
    void Sound() {
        System.out.println("Barking...");
    }
}

// child class

class Cat extends Animal {
    void Sound() {
        System.out.println("Meowing...");
    }
}
//child class
class Cow extends Animal {
    void Sound() {
        System.out.println("Mooing...");
    }
}

public class InheritanceEX1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.Sound(); // Output: Barking...
        cat.Sound(); // Output: Meowing...
        cow.Sound(); // Output: Mooing...
    }
    
}
