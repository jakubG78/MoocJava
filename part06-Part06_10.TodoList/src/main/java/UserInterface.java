
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.list = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                input = scanner.nextLine();
                this.list.add(input);
            } else if (input.equals("list")) {
                this.list.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int intInput = Integer.valueOf(scanner.nextLine());
                this.list.remove(intInput);
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
