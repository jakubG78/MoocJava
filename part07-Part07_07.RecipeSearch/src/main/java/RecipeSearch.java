
import java.io.File;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipesBook recipes = new RecipesBook();
        UserInterface userInterface = new UserInterface(recipes, scanner);
        userInterface.start();
    }
}
