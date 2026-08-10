class FoodDelivery {

    private String customerName = "Rajvir";
    private String foodItem = "Pizza";
    private int quantity = 2;

    class OrderDetails {

        void displayOrder() {
            System.out.println("Order Details:");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Food Item: " + foodItem);
            System.out.println("Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {

        FoodDelivery order = new FoodDelivery();

     
        FoodDelivery.OrderDetails details =
                order.new OrderDetails();

        details.displayOrder();

    
        Runnable deliveryStatus = new Runnable() {
            @Override
            public void run() {
                System.out.println("Delivery Status: Order is out for delivery.");
            }
        };

        deliveryStatus.run();
    }
}