package RecipeReader;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeReader implements FileHandler {

    //Class Variables

    static String fileLocationStart = "C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\";
//
//
//    public static boolean createFile(String file) throws IOException {
//        //================== CREATE/DELETE FILE ===============================================================
//
//        Path createFile = Paths.get(fileLocationStart + file);
//
//        //If the file exists we delete it
//        // - otherwise we create it at the designated file path
//        if (!Files.exists(createFile)) {
//            Files.createFile(createFile);
//            return true;
//        }
//        else{
//            return false;
//        }
//        //============================================================================================
//
//    }
//    public static void deleteFile(String file) throws IOException{
//
//        Path deleteFile = Paths.get(fileLocationStart+file);
//
//        if(Files.exists(deleteFile)){
//            Files.delete(deleteFile);
//        }
//
//    }
//    public static void writeToFile(String writeFile, ArrayList<String> information) throws IOException{
//        Path fileToWrite = Paths.get(fileLocationStart+writeFile);
//        if(Files.exists(fileToWrite)) {
//            Files.write(fileToWrite, information, Charset.forName("UTF-8"));
//        }
//    }

    public static int[] findRecipeIndeces(ArrayList<String> fileContents) {

        //=========== FIND RECIPE MARKERS ===============================================================
        int[] recipeindexes = new int[3];
        //Finds the index for the recipe name, the ingredient fileContents, and the instructions fileContents
        //adds them to their respective holders in the Recipe class
        //   - index is set to 1 after where the marker is
        for (int i = 0; i < fileContents.size(); i++) {
            String thisItem = fileContents.get(i);
            if (thisItem.toLowerCase().lastIndexOf("recipe") != -1) {
                recipeindexes[0] = i ;
            }
            if (thisItem.toLowerCase().lastIndexOf("ingredients") != -1) {
                recipeindexes[1] = i;
            }
            if (thisItem.toLowerCase().lastIndexOf("instructions") != -1) {
                recipeindexes[2] = i;
            }

            //System.out.println(fileContents.get(i));
        }
        return recipeindexes;
        //==========================================================================================


    }

    public static Recipe setRecipeInformation(ArrayList<String> fileContents) {

        Recipe recipe = new Recipe();

        int[] recipeindexes = findRecipeIndeces(fileContents);

        int recipeName = recipeindexes[0]+1;
        int ingredientsIndex = recipeindexes[1]+1;
        int instructionsIndex = recipeindexes[2]+1;

        //================ SET RECIPE INFORMATION INDECES ==========================

        //Finds The Characters in Between the Recipe and Ingredients Markers
        for (int i = recipeName; i < ingredientsIndex - 1; i++) {
            if (fileContents.get(i).matches(".*[a-z].*")) {
                recipeName = i;
            }
        }
        recipe.addName(fileContents.get(recipeName));

        for (int i = ingredientsIndex; i < instructionsIndex - 1; i++) {
            if (fileContents.get(i).matches(".*[a-z].*")) {
                recipe.addIngredient(fileContents.get(i));
            }
        }
        for (int i = instructionsIndex; i < fileContents.size(); i++) {

            if (fileContents.get(i).matches("\\s*[0-9]\\..*")) {
                recipe.addInstructions("Confirmed: " + fileContents.get(i));
            } else {
                recipe.addInstructions(fileContents.get(i));
            }

            //
        }
        return recipe;
        //===========================================================================

    }



    public static ArrayList<String> readFile(String files) throws IOException {

        ArrayList<String> fileContents = new ArrayList<String>();
        ArrayList<String> printedRecipe = new ArrayList<String>();
        try {


            //================== READ FILE INFORMATION ======================================


            //Creates a scanner object
            try (Scanner scanner = new Scanner(Paths.get(fileLocationStart + files), "UTF-8")) {
                if (!Files.exists(Paths.get(fileLocationStart + files))) {
                    System.out.println("File Doesn't Exist");
                }
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    //add line information to the fileContents object
                    fileContents.add(line);
                }

            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("File Not Existing");
            }
            //===================================================================================
            Recipe recipe = setRecipeInformation(fileContents);
            return recipe.printRecipe();
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

        } catch (IndexOutOfBoundsException e) {
            System.out.println("File Doesn't Exist");
        }
        return null;
    }

    public static void changeFileStart(String filePath) {
        Path dir = Paths.get(filePath);

        if (Files.isDirectory(dir)) {
            String filecheck = filePath.substring(filePath.length() - 1, filePath.length());
            if (filecheck.equals("\\"))
                fileLocationStart = filePath;

            else {
                filePath += "\\";
                fileLocationStart = filePath;
            }
        } else {
            System.out.println("Not accurate");
        }


    }

//    public static void main(String[] args) throws IOException {
//
//
//        System.out.println(readFile("test.txt"));
//        deleteFile("create_file.txt");
////        file.writeToFile("write_test.txt", file.printedRecipe);
////        file.deleteFile("create_file.tx
//// t");
//        changeFileStart("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src");
//        System.out.println(fileLocationStart);
//        //=============================================================================================
////
////        String aString;
////        int price;
////        InputStreamReader isr = new InputStreamReader(System.in);
////        BufferedReader br = new BufferedReader(isr);
////        System.out.println("What is the model of your phone? ");
////        aString = br.readLine();
////        System.out.println("What is the price of your phones: ");
////        price = Integer.parseInt((br.readLine()));
////        System.out.println("Phone Model: " +aString + " Cost: " + price);
//
//    }


}
