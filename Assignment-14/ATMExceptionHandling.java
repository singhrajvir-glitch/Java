import java.util.Scanner;

public class ATMExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: Rs. " + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        sc.close();
    }
}

