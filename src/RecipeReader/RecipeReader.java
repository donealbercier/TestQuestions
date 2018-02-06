package RecipeReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class RecipeReader {

    //Class Variables

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> printedRecipe = new ArrayList<String>();

    //indexes for the markers of sets of infomation
    int recipeIndex = 0;
    int ingredientsIndex = 0;
    int instructionsIndex = 0;

    Recipe recipe = new Recipe();

    public ArrayList<String> printRecipe(){
        return recipe.printRecipe();
    }


    public void createFile(String file) throws IOException{
        //================== CREATE/DELETE FILE ===============================================================

        FileWriter fw = new FileWriter();
        Path createFile = Paths.get(file);

        //If the file exists we delete it
        // - otherwise we create it at the designated file path
        if(!Files.exists(createFile)) {
            Files.createFile(createFile);
        }
        //============================================================================================

    }
    public void deleteFile(String file) throws IOException{

        Path deleteFile = Paths.get(file);

        if(Files.exists(deleteFile)){
            Files.delete(deleteFile);
        }

    }
    public void writeToFile(String writeFile, ArrayList<String> information) throws IOException{
        Path fileToWrite = Paths.get(writeFile);
        FileWriter fw = new FileWriter();
        if(Files.exists(fileToWrite)) {
            fw.writeToFile(fileToWrite.toString(), information);
        }
    }


    public void readFile(String files) throws IOException{



        //================== READ FILE INFORMATION ======================================

        //Creates a scanner object
        try (Scanner scanner = new Scanner(Paths.get(files), "UTF-8")) {
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

        //Finds The Characters in Between the Recipe and Ingredients Markers
        for (int i = recipeIndex; i < ingredientsIndex-1; i++) {
            if (list.get(i).matches(".*[a-z].*")){
                recipeIndex = i;
            }
        }
        recipe.addName(list.get(recipeIndex));

        for (int i = ingredientsIndex; i < instructionsIndex-1; i++) {
            if (list.get(i).matches(".*[a-z].*")){
                recipe.addIngredient(list.get(i));
            }
        }
        for (int i = instructionsIndex; i < list.size(); i++) {

            if(list.get(i).matches("\\s*[0-9]\\..*")){
                recipe.addInstructions("Confirmed: "+list.get(i));
            }
            else{
                recipe.addInstructions(list.get(i));
            }

            //
        }
        //===========================================================================

        //------------- TEST RECIPE INFORMATION -----------------------------------
//
//        System.out.println(recipe.getRecipeName());
//        //call the print method for the data sets
//        // method defined in the Recipe class
//
//        recipe.printIngredients();
//        recipe.printInstructions();



//        Scanner scan = new Scanner("Everything,is,split,on,i").useDelimiter(",");
//        while(scan.hasNext()){
//            System.out.println(scan.next());
//        }
        //return recipe.toString();

        printedRecipe=printRecipe();
    }

    public static void main(String[] args) throws IOException{



        RecipeReader file = new RecipeReader();
        file.readFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\test.txt");
        file.createFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create_file.txt");
        file.writeToFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\write_test.txt", file.printedRecipe);
        file.deleteFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create_file.txt");
        //=============================================================================================
//
//        String aString;
//        int price;
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("What is the model of your phone? ");
//        aString = br.readLine();
//        System.out.println("What is the price of your phones: ");
//        price = Integer.parseInt((br.readLine()));
//        System.out.println("Phone Model: " +aString + " Cost: " + price);

  }


}
