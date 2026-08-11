package faculty;

public class Faculty {

    int facultyId;
    String name;
    String department;

    public Faculty(int facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + name);
        System.out.println("Department: " + department);
    }
}