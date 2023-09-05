package Logic_Building;
import java.util.Scanner;
public class Library_Managment {
    private String[] books;
    private int totalBooks;
    private int bookINDX;

    public Library_Managment(int maxBooks) {
        this.bookINDX = maxBooks;
        books = new String[maxBooks];
    }
    public void Add_Books(String book) {
        if(totalBooks >= bookINDX) {
            System.out.println("Sorry, the library is full.");
            return;
        }
        books[totalBooks++] = book;
        System.out.println("Book \"" + book + "\" has been submitted successfully.");
    }

    public void rentBook(String book) {
        for(int i=0; i<totalBooks; i++) {
            if(books[i].equals(book)) {
                System.out.println("Book \"" + book + "\" has been rented successfully.");
                for(int j=i; j<totalBooks-1; j++) {
                    books[j] = books[j+1];
                }
                books[--totalBooks] = null;
                return;
            }
        }
        System.out.println("Sorry, the book \"" + book + " is not available.");
    }
    public void showAvailableBooks() {
        if(totalBooks == 0) {
            System.out.println("Sorry, no books available.");
            return;
        }
        System.out.println("Available books:");
        for(int i=0; i<totalBooks; i++) {
            System.out.println((i+1) + ". " + books[i]);
        }
    }
    public void returnBook(String book) {
        if(totalBooks >= bookINDX) {
            System.out.println("Sorry, the library is full.");
            return;
        }
        books[totalBooks++] = book;
        System.out.println("Book \"" + book + "\" has been returned successfully.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library_Managment library = new Library_Managment(2);
        boolean b=true;
        int choice = 0;

        while (b) {
            System.out.println("Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Show available books");
            System.out.println("3. Rent a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the book name to submit: ");
                    String bookToSubmit = scanner.nextLine();
                    library.Add_Books(bookToSubmit);
                    break;
                case 2:
                    library.showAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter the book name to rent: ");
                    String bookToRent = scanner.nextLine();
                    library.rentBook(bookToRent);
                    break;
                case 4:
                    System.out.print("Enter the book name to return: ");
                    String bookToReturn = scanner.nextLine();
                    library.returnBook(bookToReturn);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    b=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}