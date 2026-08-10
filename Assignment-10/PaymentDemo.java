abstract class Payment {

    String payerName;
    double amount;

    Payment(String payerName, double amount) {
        this.payerName = payerName;
        this.amount = amount;
    }

    // Abstract method
    abstract void makePayment();

    void displayDetails() {
        System.out.println("Payer Name: " + payerName);
        System.out.println("Amount: Rs. " + amount);
    }
}

// Credit Card class
class CreditCard extends Payment {

    String cardNumber;

    CreditCard(String payerName, double amount, String cardNumber) {
        super(payerName, amount);
        this.cardNumber = cardNumber;
    }

    void makePayment() {
        System.out.println("Payment Method: Credit Card");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Payment Successful");
    }
}

// UPI class
class UPI extends Payment {

    String upiId;

    UPI(String payerName, double amount, String upiId) {
        super(payerName, amount);
        this.upiId = upiId;
    }

    void makePayment() {
        System.out.println("Payment Method: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Successful");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        CreditCard payment1 =
                new CreditCard("Rajvir", 2500, "XXXX-1234");

        UPI payment2 =
                new UPI("Arjun", 1500, "arjun@upi");

        CreditCard payment3 =
                new CreditCard("Karan", 3200, "XXXX-5678");

        System.out.println("Payment 1:");
        payment1.displayDetails();
        payment1.makePayment();

        System.out.println();

        System.out.println("Payment 2:");
        payment2.displayDetails();
        payment2.makePayment();

        System.out.println();

        System.out.println("Payment 3:");
        payment3.displayDetails();
        payment3.makePayment();
    }
}