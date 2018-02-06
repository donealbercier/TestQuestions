package RecipeReader;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    String recipeName;
    String description;
   ArrayList<String> Ingredients = new ArrayList<String>();
    ArrayList<String> Instructions = new ArrayList<String>();

    //======= Getters and Setters =============================
    public String getRecipeName() {
        return recipeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList<String> printRecipe(){
        ArrayList<String> recipe = new ArrayList<String>();
        recipe.add("- Recipe -");
        recipe.add(recipeName);
        recipe.add("- Ingredients -");
        for (int i = 0; i < Ingredients.size(); i++) {
            recipe.add(Ingredients.get(i));

        }
        recipe.add("- Instructions -");
        for (int i = 0; i < Instructions.size(); i++) {
            recipe.add(Instructions.get(i));

        }
        return recipe;
    }

  //===================================================================

    void addName(String name){
        recipeName = name;
    }

    void addIngredient(String ingredient){
        Ingredients.add(ingredient);
    }

    void printIngredients(){
        for (int i = 0; i < Ingredients.size(); i++) {
            System.out.println(Ingredients.get(i));

        }
    }
    void addInstructions(String instruction){
        Instructions.add(instruction);
    }

    void printInstructions(){
        for (int i = 0; i < Instructions.size(); i++) {
            System.out.println(Instructions.get(i));

        }
    }

    public ArrayList<String> getIngredients() {
        return Ingredients;
    }

    public ArrayList<String> getInstructions() {
        return Instructions;
    }
//====== Constructors =========================================


    Recipe(String recipeName){
        this.recipeName=recipeName;
    }
    Recipe(){}


}
