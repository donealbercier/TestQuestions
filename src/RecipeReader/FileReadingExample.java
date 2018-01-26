package RecipeReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadingExample {
    public static void main(String[] args)throws IOException{

        String fileName = "C:/Users/donea/Documents/test.txt";

        ArrayList<String> fileContents = new ArrayList<String>();

        try {
            ReadFile file = new ReadFile(fileName);
            String[] aryLines = file.OpenFile();

            int i;
            for ( i = 0; i < aryLines.length; i++) {
                fileContents.add(aryLines[i]);
                System.out.println(aryLines[i]+"  "+i);
            }
        }
        catch (IOException e){
            System.out.println("File Doesn't Exist (-_-)");
        }




        //===========================================================================

        int recipeIndex = 0;
        int recipeNameIndex = 0;


        for (int i = 0; i < fileContents.size(); i++) {
            if(fileContents.toArray()[i].toString().lastIndexOf("recipe")!=-1){
                System.out.println("foundRecipe");
            }

            else{
                System.out.println("didnt find");
            }
        }


        System.out.println(fileContents);

    }
}
