
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pagesCount = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pagesCount, publicationYear));
        }
        System.out.print("\n" + "What information will be printed?");
        String userChoice = scanner.nextLine();
        if (userChoice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else if (userChoice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            System.out.println("Wrong display option.");
        }
    }
}
