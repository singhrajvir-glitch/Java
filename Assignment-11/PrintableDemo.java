interface Printable {

    void printDetails();
}

class Student implements Printable {

    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class Employee implements Printable {

    String name;
    int employeeId;
    String department;

    Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Student student1 =
                new Student("Rajvir", 101, "CSE");

        Student student2 =
                new Student("Arjun", 102, "CSE");

        Employee employee1 =
                new Employee("Karan", 501, "IT");

        System.out.println("Student 1:");
        student1.printDetails();

        System.out.println();

        System.out.println("Student 2:");
        student2.printDetails();

        System.out.println();

        System.out.println("Employee 1:");
        employee1.printDetails();
    }
}