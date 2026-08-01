class Restaurant {

    
    static int totalOrders = 0;

   
    void bill(double amount) {
        totalOrders++;
        System.out.println("Dine-in Bill = Rs. " + amount);
    }  

   
    void bill(double amount, double packingCharge) {
        totalOrders++;
        double total = amount + packingCharge;
        System.out.println("Takeaway Bill = Rs. " + total);
    }

   
    void bill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        double total = amount + packingCharge + deliveryCharge;
        System.out.println("Delivery Bill = Rs. " + total);
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        r.bill(500);               
        r.bill(400, 20);           
        r.bill(350, 20, 50);       

        System.out.println("Total Orders = " + totalOrders);
    }
}