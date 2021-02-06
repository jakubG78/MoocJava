
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String firstText = scan.nextLine();
        System.out.println("Enter the second string:");
        String secondText = scan.nextLine();
        if (firstText.equals(secondText)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
