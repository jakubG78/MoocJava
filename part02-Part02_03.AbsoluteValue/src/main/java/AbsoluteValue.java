
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int result = 0;
        if (number < 0) {
            result = 0 - number;
        } else {
            result = number;
        }
        System.out.println(result);
    }
}
