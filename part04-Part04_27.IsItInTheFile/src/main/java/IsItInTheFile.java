
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            boolean searchResult = false;
            while(fileScanner.hasNextLine()){
                if(fileScanner.nextLine().contains(searchedFor)){
                    searchResult = true;
                }
            }
            if(searchResult){
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }    
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
