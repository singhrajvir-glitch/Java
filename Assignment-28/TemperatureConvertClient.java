
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class TemperatureClient {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Registry registry =
                LocateRegistry.getRegistry("localhost", 1099);

            TemperatureConverter converter =
                (TemperatureConverter) registry.lookup("TemperatureService");

            System.out.println("Temperature Conversion Service");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            double temperature;
            double result;

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();

                    result = converter.celsiusToFahrenheit(temperature);

                    System.out.println(
                        "Temperature in Fahrenheit: " + result
                    );
                    break;

                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = sc.nextDouble();

                    result = converter.fahrenheitToCelsius(temperature);

                    System.out.println(
                        "Temperature in Celsius: " + result
                    );
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
