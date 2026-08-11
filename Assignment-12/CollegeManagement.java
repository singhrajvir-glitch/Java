

import student.Student;
import faculty.Faculty;

public class CollegeManagement {

    public static void main(String[] args) {

        Student student1 =
                new Student(101, "Rajvir", "CSE");

        Student student2 =
                new Student(102, "Arjun", "CSE");

        Student student3 =
                new Student(103, "Karan", "CSE");

        Faculty faculty1 =
                new Faculty(501, "Dr. Sharma", "Computer Science");

        Faculty faculty2 =
                new Faculty(502, "Dr. Mehta", "Information Technology");

        Faculty faculty3 =
                new Faculty(503, "Dr. Singh", "Electronics");

        System.out.println("----- STUDENT DETAILS -----");

        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
        System.out.println();

        student3.displayDetails();
        System.out.println();

        System.out.println("----- FACULTY DETAILS -----");

        faculty1.displayDetails();
        System.out.println();

        faculty2.displayDetails();
        System.out.println();

        faculty3.displayDetails();
    }
}