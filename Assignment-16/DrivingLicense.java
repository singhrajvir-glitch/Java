import java.util.Scanner;

// User-defined exception
class InvalidLicenseAgeException extends Exception {
    InvalidLicenseAgeException(String message) {
        super(message);
    }
}

class DrivingLicense {

    static void checkEligibility(int age) throws InvalidLicenseAgeException {
        if (age < 18) {
            throw new InvalidLicenseAgeException(
                "You are not eligible for a driving license."
            );
        } else {
            System.out.println(
                "You are eligible for a driving license."
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkEligibility(age);
        } catch (InvalidLicenseAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}