
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = Integer.valueOf(scanner.nextLine());
        int numberB = Integer.valueOf(scanner.nextLine());
        double result = Math.sqrt((double)(numberA + numberB));
        System.out.println(result);
    }
}
