import java.sql.*;
import java.util.Scanner;

class EmployeeCRUD {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company",
            "root",
            "G12ramdasG12"
        );

        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee VALUES (?, ?, ?)"
            );

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, salary);

            ps.executeUpdate();
            System.out.println("Employee Inserted");
        }

        else if (ch == 2) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE employee SET salary=? WHERE emp_id=?"
            );

            ps.setInt(1, salary);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Employee Updated");
        }

        else if (ch == 3) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employee WHERE emp_id=?"
            );

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Employee Deleted");
        }

        con.close();
        sc.close();
    }
}