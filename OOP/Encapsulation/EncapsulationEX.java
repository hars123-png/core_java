class BankAccount {
    private double balance;
    private String accountNumber;
    BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;


    }

    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

      class EncapsulationEX {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789", 1000.0);
            account.deposit(500.0);
            account.withdraw(200.0); 
            System.out.println("Current Balance: " + account.balance); // This will cause an error due to private access     
        }
    
     }
    }
