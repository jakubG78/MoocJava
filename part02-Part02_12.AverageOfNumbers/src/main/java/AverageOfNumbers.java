
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            sumOfNumbers = sumOfNumbers + number;
            counter = counter + 1;
        }
        if (counter != 0) {
            double averageOfNumbers = (double) sumOfNumbers / counter;
            System.out.println("Average of the numbers: " + averageOfNumbers);
        }
    }
}
