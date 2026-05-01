interface AccountOperations {
    void deposit(double amount);
    
}

interface LoanOperations {
    void applyForLoan(double amount);
}

class SmartBankAccount implements AccountOperations, LoanOperations {
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void applyForLoan(double amount) {
        balance += amount; // Assuming loan amount is added to balance
        System.out.println("Applied for loan: " + amount);
    }
}

public class Multiple_inheritance {
    public static void main(String[] args) {
        SmartBankAccount account = new SmartBankAccount();
        account.deposit(1000);
        account.applyForLoan(5000);
    }
}