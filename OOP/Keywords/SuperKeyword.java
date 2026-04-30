
// class Parent{
//     Parent(){
//         System.out.println("parent constructor");
//     }
// }
//  class Child extends Parent{
//     Child(){
//         super(); // calls parent constructor
//         System.out.println("Child Constructor");
//     }

//  }

// public class SuperKeyword {


// }


class Employee{
    String company;

    // parents constructor
    Employee(String company){
        this.company = company;
        System.out.println("Employee COnstructor Called");

    }

    void getDetails(){
        System.out.println("Company: "+ company);

    }
}

class Manager extends Employee{
    String department;

    // child constructor

    Manager(String company, String department){
        super(company); // calling parent constrructor
        this.department = department;
        System.out.println("Manager Constructor Called");
    }

    void getFullDetails(){
        super.getDetails(); // calling parent method
        System.out.println("Department :"+ department);

    }

}

public class SuperKeyword{
    public static void main(String[] args) {
        Manager manager = new Manager(null, null);
        System.out.println("\nManager Details");
        manager.getFullDetails();
    }
    }

