
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipesBook {

    private ArrayList<Recipe> recipes;

    public RecipesBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void loadRecipesBookFromFile(String fileName) {

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String name = row;
                row = scanner.nextLine();
                int cookingTime = Integer.valueOf(row);
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    row = scanner.nextLine();
                    if (!row.isEmpty()) {
                        ingredients.add(row);
                    } else {
                        break;
                    }
                }
                Recipe readedRecipe = new Recipe(name, cookingTime, ingredients);
                this.recipes.add(readedRecipe);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("File loading error: " + e.getMessage());
        }
    }

    public ArrayList<Recipe> searchRecipeByName(String name) {
        ArrayList<Recipe> searchedRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(name)) {
                searchedRecipes.add(recipe);
            }
        }
        return searchedRecipes;
    }

    public ArrayList<Recipe> sesearchRecipeByCookingTime(int time) {
        ArrayList<Recipe> searchedRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= time) {
                searchedRecipes.add(recipe);
            }
        }
        return searchedRecipes;
    }

    public ArrayList<Recipe> searchRecipesByIngredient(String ingredient) {
        ArrayList<Recipe> searchedRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            for (String ingridient : recipe.getIngredients()) {
                if (ingredient.equals(ingridient)) {
                    searchedRecipes.add(recipe);
                }
            }
        }
        return searchedRecipes;
    }
}
