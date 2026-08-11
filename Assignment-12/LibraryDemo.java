import library.Book;

public class LibraryDemo {

    public static void main(String[] args) {

        Book book1 = new Book(
                101,
                "Effective Java",
                "Joshua Bloch",
                850
        );

        Book book2 = new Book(
                102,
                "Java: The Complete Reference",
                "Herbert Schildt",
                950
        );

        Book book3 = new Book(
                103,
                "Core Java",
                "Cay S. Horstmann",
                900
        );

        System.out.println("----- LIBRARY BOOK DETAILS -----");
        System.out.println();

        book1.displayDetails();
        System.out.println();

        book2.displayDetails();
        System.out.println();

        book3.displayDetails();
    }
}