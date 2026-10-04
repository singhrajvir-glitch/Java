import java.util.Scanner;

class ATM {
    
    static void verifyPIN(int pin) throws Exception {
        int correctPIN = 1234;

        if (pin != correctPIN) {
            throw new Exception("Invalid PIN!");
        }

        System.out.println("PIN Verified Successfully!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();

            verifyPIN(pin);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("ATM PIN verification process completed.");
        }

        sc.close();
    }
}