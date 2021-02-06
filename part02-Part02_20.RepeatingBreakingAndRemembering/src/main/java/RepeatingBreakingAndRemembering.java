
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sumOfnumbers = 0;
        int totalNumbersCounter = 0;
        int oddNumbersCounter = 0;
        int evenNumbersCounter = 0;

        System.out.println("Give numbers:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                evenNumbersCounter++;
            } else {
                oddNumbersCounter++;
            }

            sumOfnumbers += input;
            totalNumbersCounter++;
        }
        double average = (double) sumOfnumbers / totalNumbersCounter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfnumbers);
        System.out.println("Numbers: " + totalNumbersCounter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbersCounter);
        System.out.println("Odd: " + oddNumbersCounter);
    }
}
