
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNameLenght = 0;
        String longestName = "";
        double ageSum = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            int currentNameLenght = pieces[0].length();
            if (longestNameLenght < currentNameLenght) {
                longestNameLenght = currentNameLenght;
                longestName = pieces[0];
            }
            ageSum += Integer.valueOf(pieces[1]);
            counter++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * ageSum / counter));
    }
}
