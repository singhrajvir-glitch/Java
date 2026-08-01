import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        System.out.println("1. Add Course");
        System.out.println("2. Remove Course");
        System.out.println("3. View Courses");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter course: ");
                String course = sc.nextLine();
                courses.add(course);
                System.out.println("Course Added.");
                break;

            case 2:
                System.out.print("Enter course to remove: ");
                String remove = sc.nextLine();

                if (courses.remove(remove)) {
                    System.out.println("Course Removed.");
                } else {
                    System.out.println("Course Not Found.");
                }
                break;

            case 3:
                System.out.println("Courses:");
                for (String c : courses) {
                    System.out.println(c);
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}