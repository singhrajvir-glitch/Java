abstract class FoodOrder {

    String customerName;
    double foodPrice;

    FoodOrder(String customerName, double foodPrice) {
        this.customerName = customerName;
        this.foodPrice = foodPrice;
    }

    // Abstract method
    abstract void calculateBill();

    void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Price: Rs. " + foodPrice);
    }
}

// Dine-In Order
class DineInOrder extends FoodOrder {

    double serviceCharge;

    DineInOrder(String customerName, double foodPrice) {
        super(customerName, foodPrice);
        serviceCharge = foodPrice * 0.05;
    }

    void calculateBill() {
        double total = foodPrice + serviceCharge;

        System.out.println("Order Type: Dine-In");
        System.out.println("Service Charge: Rs. " + serviceCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

// Take-Away Order
class TakeAwayOrder extends FoodOrder {

    double packingCharge;

    TakeAwayOrder(String customerName, double foodPrice) {
        super(customerName, foodPrice);
        packingCharge = 50;
    }

    void calculateBill() {
        double total = foodPrice + packingCharge;

        System.out.println("Order Type: Take-Away");
        System.out.println("Packing Charge: Rs. " + packingCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        DineInOrder order1 =
                new DineInOrder("Rajvir", 800);

        TakeAwayOrder order2 =
                new TakeAwayOrder("Arjun", 600);

        DineInOrder order3 =
                new DineInOrder("Karan", 1000);

        System.out.println("Order 1:");
        order1.displayCustomer();
        order1.calculateBill();

        System.out.println();

        System.out.println("Order 2:");
        order2.displayCustomer();
        order2.calculateBill();

        System.out.println();

        System.out.println("Order 3:");
        order3.displayCustomer();
        order3.calculateBill();
    }
}