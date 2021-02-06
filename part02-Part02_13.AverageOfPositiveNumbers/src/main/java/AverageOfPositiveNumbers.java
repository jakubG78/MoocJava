
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositiveNumbers = 0;
        int counter = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sumOfPositiveNumbers = sumOfPositiveNumbers + number;
                counter = counter + 1;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfPositiveNumbers / counter);
        }
    }
}
