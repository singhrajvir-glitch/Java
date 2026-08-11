import java.io.*;

public class PatientFileHandling {

    public static void main(String[] args) {

        String fileName = "patient.txt";


        // Writing patient details
        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write("Patient ID: 201\n");
            writer.write("Name: Rahul\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n\n");

            writer.write("Patient ID: 202\n");
            writer.write("Name: Amit\n");
            writer.write("Age: 30\n");
            writer.write("Diagnosis: Cold\n\n");

            writer.write("Patient ID: 203\n");
            writer.write("Name: Priya\n");
            writer.write("Age: 28\n");
            writer.write("Diagnosis: Flu\n");

            writer.close();

            System.out.println("Patient details written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }


        // Reading patient details
        try {

            FileReader reader = new FileReader(fileName);

            int character;

            System.out.println("\nPatient Details:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}