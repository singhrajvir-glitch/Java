import java.sql.*;

class StudentRecords {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "G12ramdasG12";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                url, username, password
            );

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM students";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Records");
            System.out.println("-------------------------");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("-------------------------");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}