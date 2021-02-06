
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
        int sumOfNumbers = 0;
        double averageOfNumbers = 0;
        for (Integer number : numbers) {
            sumOfNumbers = sumOfNumbers + number;
        }
        averageOfNumbers = (double)sumOfNumbers / numbers.size();
        System.out.println("Average: " + averageOfNumbers);
    }
}
