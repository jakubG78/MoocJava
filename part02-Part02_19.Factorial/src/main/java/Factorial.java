
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.print("Factorial: " + result);
    }
}
