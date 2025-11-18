public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println(
            "Account Number: " + accountNumber +
            ", Account Holder: " + accountHolderName +
            ", Balance: " + balance
        );
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("123456789", "Alice", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "Bob", 500.0);

        account1.deposit(200.0);
        account1.withdraw(150.0);
        account1.displayBalance();

        account2.deposit(300.0);
        account2.withdraw(800.0);
        account2.displayBalance();
    }
}
