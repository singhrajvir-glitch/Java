class Vehicle {

    private String vehicleName = "Royal Enfield Classic 350";
    private String vehicleType = "Motorcycle";
    private int speed = 120;


    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Name: " + vehicleName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Maximum Speed: " + speed + " km/h");
        }
    }

    public static void main(String[] args) {

   
        Vehicle vehicle = new Vehicle();

        
        Vehicle.VehicleDetails details = vehicle.new VehicleDetails();

        System.out.println("Vehicle Details:");
        details.displayDetails();

        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Action: Vehicle is starting...");
            }
        };

        action.run();
    }
}