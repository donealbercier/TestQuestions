package RecipeReader;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReadingTests {
    public static void main(String[] args) throws IOException{
//        String aString;
//        int price;
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("What is the model of your phone? ");
//        aString = br.readLine();
//        System.out.println("What is the price of your phones: ");
//        price = Integer.parseInt((br.readLine()));
//        System.out.println("Phone Model: " +aString + " Cost: " + price);

       ArrayList<String> list = new ArrayList<String>();

       //indexes for the markers of sets of infomation
       int recipeIndex = 0;
       int ingredientsIndex = 0;
       int instructionsIndex = 0;


       //================== READ FILE INFORMATION ======================================

       //Creates a scanner object
        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\test.txt"), "UTF-8")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //add line information to the list object
                list.add(line);
            }

        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        //===================================================================================

        //=========== FIND RECIPE MARKERS ===============================================================

        //Finds the index for the recipe name, the ingredient list, and the instructions list
        //adds them to their respective holders in the Recipe class
        //   - index is set to 1 after where the marker is
        for (int i = 0; i < list.size(); i++) {
            String thisItem = list.get(i);
            if(thisItem.lastIndexOf("Recipe")!=-1){
                recipeIndex = i+1;
            }
            if(thisItem.lastIndexOf("Ingredients")!=-1){
                ingredientsIndex = i+1;
            }
            if(thisItem.lastIndexOf("Instructions")!=-1){
                instructionsIndex = i+1;
            }
            //System.out.println(list.get(i));
        }
        //==========================================================================================

        //================ SET RECIPE INFORMATION INDECES ==========================
        Recipe recipe = new Recipe(list.get(recipeIndex));
        for (int i = ingredientsIndex; i < instructionsIndex-1; i++) {
            String theIngredient = list.get(i);
            recipe.addIngredient(theIngredient);
        }
        for (int i = instructionsIndex; i < list.size(); i++) {
            String theInstruction = list.get(i);

            recipe.addInstructions(theInstruction);
            //
        }
        //===========================================================================

        //------------- TEST RECIPE INFORMATION -----------------------------------

        System.out.println(recipe.getRecipeName());
        //call the print method for the data sets
        // method defined in the Recipe class

        recipe.printIngredients();
        recipe.printInstructions();

        //================== CREATE/DELETE FILE ===============================================================
        Path createFile = Paths.get("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create_file.txt");

        if(!Files.exists(createFile)) {
            Files.createFile(createFile);
        }
        else{
            Files.delete(createFile);
        }
        //============================================================================================

        //=========== WRITE TO FILE ===============================================================

        //Creates a FileWriter object called fw
        FileWriter fw = new FileWriter();
        //Writes information to the file path
        fw.writeToFile(createFile.toString(),recipe.getIngredients());
        fw.writeToFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\write_test.txt", recipe.getInstructions());

        //=============================================================================================
//
//        Scanner scan = new Scanner("Everything,is,split,on,i").useDelimiter(",");
//        while(scan.hasNext()){
//            System.out.println(scan.next());
//        }
  }


}
