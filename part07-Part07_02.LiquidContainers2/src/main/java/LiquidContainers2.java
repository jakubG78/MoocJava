
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputPieces = input.split(" ");
            String command = inputPieces[0];
            int amount = Integer.valueOf(inputPieces[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            } else if (command.equals("move")) {
                if (firstContainer.contains() - amount <= 0) {
                    secondContainer.add(firstContainer.contains());
                } else {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);
                }
            } else if (command.equals("remove")) {
                if (secondContainer.contains() - amount <= 0) {
                    secondContainer.remove(secondContainer.contains());
                } else {
                    secondContainer.remove(amount);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
