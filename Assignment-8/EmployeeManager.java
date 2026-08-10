class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int salary, String department) {

        // Calling parent class constructor
        super(name, salary);

        this.department = department;
    }

    void displayManagerDetails() {

        // Accessing parent class method
        super.displayDetails();

        System.out.println("Department: " + department);
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        Manager m = new Manager("Rajvir", 60000, "IT");

        System.out.println("Manager Details:");
        m.displayManagerDetails();
    }
}