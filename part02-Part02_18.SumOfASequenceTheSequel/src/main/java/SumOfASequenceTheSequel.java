
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int i;
        i = firstNumber;
        if (lastNumber > firstNumber) {
            while (i <= lastNumber) {
                sum += i;
                i++;
            }
        }
        System.out.print("The sum is " + sum);
    }
}
