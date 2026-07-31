public class MobilePhone{
    int id;
    String brand;

    // Default Constructor
    MobilePhone() {
        id = 100;
        brand = "Unknown";
    }

    // Parameterized Constructor
    MobilePhone(int i, String b) {
        id = i;
        brand = b;
    }

    // Copy Constructor
    MobilePhone(MobilePhone m) {
        id = m.id;
        brand = m.brand;
    }

    void print() {
        System.out.println("Mobile ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println();
    }

    public static void main(String[] args) {

        // Parameterized Constructor
        MobilePhone obj1 = new MobilePhone(101, "Samsung");
        obj1.print();

        MobilePhone obj2 = new MobilePhone(102, "Apple");
        obj2.print();

        // Default Constructor
        MobilePhone obj3 = new MobilePhone();
        obj3.print();

        // Another Parameterized Constructor
        MobilePhone obj4 = new MobilePhone(103, "OnePlus");
        obj4.print();

        // Copy Constructor (Duplicate Record)
        MobilePhone obj5 = new MobilePhone(obj1);
        obj5.print();
    }
}