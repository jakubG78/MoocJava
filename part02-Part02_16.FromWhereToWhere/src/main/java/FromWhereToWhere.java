
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        int endNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startNumber = Integer.valueOf(scanner.nextLine());
        if (endNumber >= startNumber) {
            /* 
                for (int i = startNumber; i <= endNumber; i++) {
                    System.out.println(i);
                    }
             */
            int i = startNumber;
            while(i<=endNumber){
                System.out.println(i);
                i++;
            }
        }

    }
}
