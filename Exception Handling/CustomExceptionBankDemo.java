class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }   
}

class BankAccount{
    int balance = 5000;
    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. You cannot withdraw " + amount);
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful.  " );
        System.out.println("Remaining balance: " + balance);
    }                               

}

public class CustomExceptionBankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(6000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}