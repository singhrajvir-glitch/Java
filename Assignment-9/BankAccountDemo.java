class BankAccount {

    // Final variable
    final int accountNumber;

    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
        System.out.println();
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(10101, "Rajvir", 50000);

        BankAccount account2 =
                new BankAccount(10102, "Arjun", 75000);

        BankAccount account3 =
                new BankAccount(10103, "Karan", 62000);

        System.out.println("Bank Account Details:");

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();

        
    }
}