
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFileName = scanner.nextLine();
        try ( Scanner fileScanner = new Scanner(Paths.get(inputFileName))) {
            while (fileScanner.hasNextLine()) {
                String fileRow = fileScanner.nextLine();
                System.out.println(fileRow);
            }
        } catch (Exception e) {
            System.out.println("File reagin error: " + e.getMessage());
        }
    }
}
