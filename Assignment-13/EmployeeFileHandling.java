import java.io.*;

public class EmployeeFileHandling {

    public static void main(String[] args) {

        String fileName = "employee.txt";

        // Writing data to file
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Employee ID: 101\n");
            writer.write("Name: Rajvir\n");
            writer.write("Department: CSE\n");
            writer.write("Salary: 60000\n\n");

            writer.write("Employee ID: 102\n");
            writer.write("Name: Arjun\n");
            writer.write("Department: IT\n");
            writer.write("Salary: 55000\n\n");

            writer.write("Employee ID: 103\n");
            writer.write("Name: Karan\n");
            writer.write("Department: ECE\n");
            writer.write("Salary: 50000\n");

            writer.close();

            System.out.println("Employee details written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }


        // Reading data from file
        try {
            FileReader reader = new FileReader(fileName);

            int character;

            System.out.println("\nEmployee Details:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
