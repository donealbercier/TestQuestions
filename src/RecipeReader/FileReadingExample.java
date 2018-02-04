package RecipeReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadingExample {
    public static void main(String[] args){
    /*
        In the class FileReadingExample we use the methods and
        funcitonality of the ReadFile class in order to open a file and
        perform fancy logic.

        All of the actual File reading occurs in the ReadFile object

     */

        //file location
        String fileName = "C:/Users/donea/Documents/test.txt";

        /*Creates an ArrayList in order to hold the fileContents dynamically
          ArrayList<String> fileContents = new ArrayList<String>();
          in hindsight this is redundant as aryLines containes the file contents already
        */


        //try block in case the filepath is invalid or the file can't be opened
        try {
            //Creates a ReadFile object that contains the file reading methods
            ReadFile file = new ReadFile(fileName);
            //A String Array is created from the contents of the file in order
            //  to determine how many lines are used
            String[] aryLines = file.OpenFile();

            /*
            This for loop iterates through the aryLines array
            -prints them onto the terminal
             */
            int recipeIndex = 0;
            int recipeNameIndex = 0;


            for (int i = 0; i < aryLines.length; i++) {
               // fileContents.add(aryLines[i]);
                System.out.println(aryLines[i]);


                //=======================================================

            }
            //iterates throught the aryLines data looking for the string recipe

            for (int j  = 0; j < aryLines.length -1; j++) {
                if(aryLines[j].lastIndexOf("Recipe")!=-1){
                    System.out.println("foundRecipe");
                    recipeIndex=j;
                    recipeNameIndex=j+1;
                }

            }

            System.out.println(aryLines[recipeIndex]);
            System.out.println(aryLines[recipeNameIndex]);
        }
        catch (IOException e){
            System.out.println("File Doesn't Exist (-_-)");
        }




        //========


    }
}
