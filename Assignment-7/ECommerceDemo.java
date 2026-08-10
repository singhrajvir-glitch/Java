interface ProductInterface {

    void displayProductType();
}

// Parent class
class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs. " + price);
    }
}

// Electronic product
class Electronic extends Product implements ProductInterface {

    Electronic(String name, double price) {
        super(name, price);
    }

    public void displayProductType() {
        System.out.println("Product Type: Electronic");
    }
}

// Clothing product
class Clothing extends Product implements ProductInterface {

    Clothing(String name, double price) {
        super(name, price);
    }

    public void displayProductType() {
        System.out.println("Product Type: Clothing");
    }
}

// Grocery product
class Grocery extends Product implements ProductInterface {

    Grocery(String name, double price) {
        super(name, price);
    }

    public void displayProductType() {
        System.out.println("Product Type: Grocery");
    }
}

public class ECommerceDemo {

    public static void main(String[] args) {

        Electronic e = new Electronic("Headphones", 2599);
        Clothing c = new Clothing("T-Shirt", 999);
        Grocery g = new Grocery("Rice", 750);

        System.out.println("Electronic Product:");
        e.displayDetails();
        e.displayProductType();

        System.out.println();

        System.out.println("Clothing Product:");
        c.displayDetails();
        c.displayProductType();

        System.out.println();

        System.out.println("Grocery Product:");
        g.displayDetails();
        g.displayProductType();
    }
}