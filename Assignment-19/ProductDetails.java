import java.sql.*;

class ProductDetails {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/shop";
        String username = "root";
        String password = "G12ramdasG12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                url, username, password
            );

            Statement stmt = con.createStatement();

            String query = "SELECT product_id, product_name, quantity, price FROM products";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Product Details");
            System.out.println("-------------------------");

            while (rs.next()) {
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Product Name: " + rs.getString("product_name"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Price: ₹" + rs.getDouble("price"));
                System.out.println("-------------------------");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}