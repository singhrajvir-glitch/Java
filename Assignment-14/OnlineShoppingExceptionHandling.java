import java.util.Scanner;

public class OnlineShoppingExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            try {
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                if (quantity <= 0) {
                    throw new IllegalArgumentException(
                        "Quantity must be greater than zero."
                    );
                }

                System.out.println("Product: " + product);
                System.out.println("Quantity: " + quantity);
                System.out.println("Order placed successfully!");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid quantity. Please enter a number.");
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }

        sc.close();
    }
}
