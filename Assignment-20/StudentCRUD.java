
import java.sql.*;
import java.util.Scanner;

class StudentCRUD {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb",
            "root",
            "G12ramdasG12"
        );

        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");

        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Course: ");
            String course = sc.next();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?, ?)"
            );

            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setInt(4, marks);

            ps.executeUpdate();

            System.out.println("Student Inserted");
        }

        else if (ch == 2) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Enter New Marks: ");
            int marks = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE student SET marks=? WHERE roll_no=?"
            );

            ps.setInt(1, marks);
            ps.setInt(2, roll);

            ps.executeUpdate();

            System.out.println("Student Updated");
        }

        else if (ch == 3) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM student WHERE roll_no=?"
            );

            ps.setInt(1, roll);

            ps.executeUpdate();

            System.out.println("Student Deleted");
        }

        con.close();
        sc.close();
    }
}
