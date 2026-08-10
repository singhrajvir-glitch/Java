class Vehicle {

    String vehicleNumber;
    String vehicleModel;

    Vehicle(String vehicleNumber, String vehicleModel) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleModel = vehicleModel;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Model: " + vehicleModel);
    }
}

class VehicleInsurance extends Vehicle {

    String insuranceCompany;
    double premium;

    VehicleInsurance(String vehicleNumber, String vehicleModel,
                     String insuranceCompany, double premium) {

        // Calling parent class constructor
        super(vehicleNumber, vehicleModel);

        this.insuranceCompany = insuranceCompany;
        this.premium = premium;
    }

    void displayInsuranceDetails() {

        // Calling parent class method
        super.displayVehicleDetails();

        System.out.println("Insurance Company: " + insuranceCompany);
        System.out.println("Insurance Premium: Rs. " + premium);
    }
}

public class VehicleInsuranceDemo {

    public static void main(String[] args) {

        VehicleInsurance v = new VehicleInsurance(
                "MH12AB1234",
                "Royal Enfield Classic 350",
                "ICICI Lombard",
                8500
        );

        System.out.println("Vehicle Insurance Details:");
        v.displayInsuranceDetails();
    }
}