class Employee{
    String name;
    double salary;

    Employee( String name,double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("constructor called");

    }
    
    void displayDetails(){
        System.out.println("Employee name"+ name+ "salary"+ salary);

    }

    

}



public class Main{
    public static void main(String[] args){
        Employee emp1 = new Employee("John", 50000);
        emp1.displayDetails();

        System.err.println("end program");

    }
}