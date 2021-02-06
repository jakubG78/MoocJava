
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mainCharName = scanner.nextLine();
        
        System.out.println("What is their job?");
        String mainCharJob = scanner.nextLine();
        
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + mainCharName + ", who was " + mainCharJob + ".");
        System.out.println("On the way to work, " + mainCharName + " reflected on life.");
        System.out.println("Perhaps " + mainCharName + " will not be " + mainCharJob + " forever.");
        // Write your program here
    }
}
