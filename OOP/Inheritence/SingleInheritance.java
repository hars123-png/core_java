
/*	we can take Account as a base class with common functionality like Deposit and Withdraw. Then, SavingsAccount inherits from Account and adds extra behavior like applying interest.This way, inheritance avoids code duplication and gives us reusability
 */

// Base Class
class Account {
  String accountHolder;
  double balance;

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited " + amount + ". New balance: " + balance);
  }
}

// Derived Class
class SavingsAccount extends Account {
  double interestRate;

  void applyInterest() {
    double interest = balance * interestRate / 100;
    balance += interest;
    System.out.println("Interest Applied: " + interest + ". New Balance: " + balance);
  }
}

public class SingleInheritance {
  public static void main(String[] args) {
    SavingsAccount sa = new SavingsAccount();
    sa.accountHolder = "Pranav";
    sa.balance = 1000;
    sa.interestRate = 5;
    sa.deposit(500); // Inherited from Account
    sa.applyInterest(); // Defined in SavingsAccount

  }
}