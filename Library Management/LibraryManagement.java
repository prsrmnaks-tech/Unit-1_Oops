import java.util.*;

class BookDetails {
    String name;
    int id;
    boolean issue;

    BookDetails(String name, int id) {
        this.name = name;
        this.id = id;
        this.issue = false;
    }

    void issue() {
        if (!issue) {
            issue = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    void returnBook() {
        if (issue) {
            issue = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void display() {
        System.out.println("Book Name : " + name);
        System.out.println("Book ID : " + id);
        System.out.println("Status : " + (issue ? "Issued" : "Available"));
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of book:");
        String name = s.nextLine();

        System.out.println("Enter the id of book:");
        int id = s.nextInt();

        BookDetails b1 = new BookDetails(name, id);

        System.out.println("Enter your choice");
        int choice = s.nextInt();

        if (choice == 1) {
            b1.issue();
        } else if (choice == 2) {
            b1.returnBook();
        } else if (choice == 3) {
            b1.display();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}