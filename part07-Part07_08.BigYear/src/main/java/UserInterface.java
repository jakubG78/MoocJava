
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdsLog birdsLog;

    public UserInterface(BirdsLog birdsLog, Scanner scanner) {
        this.birdsLog = birdsLog;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            switch (input) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    this.birdsLog.addBird(new Bird(name, latinName));
                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    name = scanner.nextLine();
                    this.birdsLog.addBirdObservationToLog(name);
                    break;
                case "One":
                    System.out.print("Bird? ");
                    name = scanner.nextLine();
                    this.birdsLog.printOneBird(name);
                    break;
                case "All":
                    this.birdsLog.printAllBirds();
                    break;
                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }
}
