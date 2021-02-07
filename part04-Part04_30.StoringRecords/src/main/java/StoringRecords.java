
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try ( Scanner fileScaner = new Scanner(Paths.get(file))) {
            while (fileScaner.hasNextLine()) {
                String fileRow = fileScaner.nextLine();
                String[] fileRowParts = fileRow.split(",");
                String readedName = fileRowParts[0];
                int readedAge = Integer.valueOf(fileRowParts[1]);
                persons.add(new Person(readedName, readedAge));
            }
        } catch (Exception e) {
            System.out.println("File reading error: " + e.getMessage());
        }
        return persons;
    }
}
