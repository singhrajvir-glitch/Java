class Book {

   
    final String ISBN;

    String title;
    String author;
    double price;

    Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book ISBN: " + ISBN);
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

public class LibraryBookDemo {

    public static void main(String[] args) {

        Book book1 = new Book(
                "978-0134685991",
                "Effective Java",
                "Joshua Bloch",
                850
        );

        Book book2 = new Book(
                "978-0321356680",
                "Java: The Complete Reference",
                "Herbert Schildt",
                950
        );

        Book book3 = new Book(
                "978-0135166307",
                "Core Java",
                "Cay S. Horstmann",
                900
        );

        System.out.println("Library Book Details:");

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

    
    }
}