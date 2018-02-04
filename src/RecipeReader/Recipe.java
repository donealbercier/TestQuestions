package RecipeReader;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    String recipeName;
    String description;
   List Ingredients = new ArrayList();
    List Instructions = new ArrayList();

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


  //===================================================================

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

    public List getIngredients() {
        return Ingredients;
    }

    public List getInstructions() {
        return Instructions;
    }
//====== Constructors =========================================


    Recipe(String recipeName){
        this.recipeName=recipeName;
    }


}
