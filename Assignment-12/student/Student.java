package student;

public class Student {

    int rollNo;
    String name;
    String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }
}
