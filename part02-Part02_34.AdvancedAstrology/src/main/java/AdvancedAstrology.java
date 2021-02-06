
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int width = size;
        for (int i = 1; i <= size; i++) {
            printSpaces(width - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = 1;
        while (j <= height){
            printSpaces(height-j);
            printStars(i);
            i += 2;
            j++;
        }
        int k = 0;
        while (k < 2){
            printSpaces(height-2);
            printStars(3);
            k++;
        }
    }
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(2);
    }
}
