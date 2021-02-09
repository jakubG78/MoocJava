
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> itemList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String idInput = scanner.nextLine();
            if (idInput.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.equals("")) {
                break;
            }
            Item inputItem = new Item(idInput, nameInput);
            if (!itemList.contains(inputItem)) {
                itemList.add(inputItem);
            }
        }
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}
