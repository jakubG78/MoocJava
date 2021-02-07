
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String readedRow = fileScanner.nextLine();
                String[] rowParts = readedRow.split(",");
                if (Integer.valueOf(rowParts[1]) == 1) {
                    System.out.println(rowParts[0] + ", age: " + rowParts[1] + " year");
                } else {
                    System.out.println(rowParts[0] + ", age: " + rowParts[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("File reading error " + e.getMessage());
        }

    }
}
