class Employee{
    String name;
    double baseSalary;

    // Method to calculate Salary (can be overriden)
    public double calculateSalary(){
        return baseSalary; //default logic
    }

    public void showDetails(){
        System.out.println("Employee: " + name + ",Salary: " + calculateSalary());
    }


}

//Full-time Employee

class FullTimeEmployee extends Employee{
    double bonus;
    

    @Override
     public double calculateSalary(){
        return baseSalary + bonus;
    }

     @Override
     public void showDetails(){
        System.out.println("Full- Time Employee: " + name + ",Salary: "+ calculateSalary());

     }
    }

    //part time Employee

    class PartTimeEmployee extends Employee{
        int hoursWorked;
        double hourlyRate;

        @Override
        public double calculateSalary(){
            return hoursWorked *hourlyRate;
        }

        @Override
        public void showDetails(){
            System.out.println("Part-Time Employee: "+ name + ", Salary: " + calculateSalary());
        }
    }


    //Temporary Employee
     class TemporaryEmployee extends Employee{
        int daysWorked;
        double dailyRate;

        @Override
        public double calculateSalary(){
            return daysWorked * dailyRate;

        }

        @Override
        public void showDetails(){
            System.out.println("Temporary Employee: " + name + ", Salary: " + calculateSalary());
        }


     }

     //Main Class

     public class OverridingEx{
        public static void main(String[] args) {
               //dynamic method dispatch
            Employee emp1 = new FullTimeEmployee();
            emp1.name = "Amit";
            emp1.baseSalary = 30000;
            ((FullTimeEmployee) emp1).bonus = 5000;
           

            Employee emp2 = new PartTimeEmployee();
            emp2.name = "Sneha";
            ((PartTimeEmployee) emp2).hoursWorked =100;
            ((PartTimeEmployee) emp2).hourlyRate=200;
            

            Employee emp3 = new TemporaryEmployee();
            emp3.name ="Ravi";
            ((TemporaryEmployee) emp3).daysWorked =15;
            ((TemporaryEmployee) emp3).dailyRate = 1000;

             

            //Runtime Polymorphism 
             emp1.showDetails();
              emp2.showDetails();
               emp3.showDetails();



            
        }
     }
