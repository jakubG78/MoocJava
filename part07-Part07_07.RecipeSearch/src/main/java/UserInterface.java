
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipesBook recipes;

    public UserInterface(RecipesBook recipes, Scanner scanner) {
        this.recipes = recipes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String input = scanner.nextLine();
        recipes.loadRecipesBookFromFile(input);
        System.out.println("");
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            ArrayList<Recipe> foundRecipes = new ArrayList<>();
            switch (input) {
                case "list":
                    printRecipes(this.recipes.getRecipes());
                    break;

                case "find name":
                    System.out.print("Searched word: ");
                    input = scanner.nextLine();
                    foundRecipes = recipes.searchRecipeByName(input);
                    printRecipes(foundRecipes);
                    break;

                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    input = scanner.nextLine();
                    int searchedCookingTime = Integer.valueOf(input);
                    foundRecipes = recipes.sesearchRecipeByCookingTime(searchedCookingTime);
                    printRecipes(foundRecipes);
                    break;

                case "find ingredient":
                    System.out.print("Ingredient: ");
                    input = scanner.nextLine();
                    foundRecipes = recipes.searchRecipesByIngredient(input);
                    printRecipes(foundRecipes);
                    break;
                
                case "stop": {
                    break;
                }
                
                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }

    public void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
    }
}
