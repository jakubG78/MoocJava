
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.valueOf(scanner.nextLine());
        int result = inputNumber * inputNumber;
        System.out.println(result);
    }
}
