package RecipeReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public interface FileHandler {

    //fileContents holds all the information contained in a file
    //  -edit fileContents should not be held at the class Level

    //RootFileLocation prevents the need for the user to type the entire path
    static String fileLocationStart = "C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\";

    default  boolean createFile(String file) throws IOException{
        //================== CREATE FILE ===============================================================

        Path createFile = Paths.get(fileLocationStart+file);

        //If the file doesn't exist we create it & return true
        if(!Files.exists(createFile)) {
            Files.createFile(createFile);
            return true;
        }

        //Else we return false
        else{
            return false;
        }

        //============================================================================================

    }



    default  boolean deleteFile(String file) throws IOException{
        //================== DELETE FILE ===============================================================

        Path deleteFile = Paths.get(fileLocationStart+file);

        if(Files.exists(deleteFile)){
            Files.delete(deleteFile);
            return true;
        }
        else{
            return false;
        }

        //============================================================================================

    }

    public default boolean writeToFile(String writeFile, ArrayList<String> information) throws IOException{
        //================== WRITE TO FILE===========================================================
        Path fileToWrite = Paths.get(fileLocationStart+writeFile);

        if(Files.exists(fileToWrite)) {
            Files.write(fileToWrite, information, Charset.forName("UTF-8"));
            return true;
        }

        else{
            return false;
        }
        //============================================================================================

    }

//    public default ArrayList<String> readFile(String files) throws IOException {
//        ArrayList<String> fileContents = new ArrayList<String>();
//
//        try {
//
//
//            //================== READ FILE INFORMATION ======================================
//
//            //Creates a scanner object
//            try (Scanner scanner = new Scanner(Paths.get(fileLocationStart + files), "UTF-8")) {
//                while (scanner.hasNextLine()) {
//                    String line = scanner.nextLine();
//                    //add line information to the fileContents object
//                    fileContents.add(line);
//                }
//
//            } catch (IOException io) {
//                System.out.println(io.getMessage());
//            }
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("File Doesn't Exist");
//        }
//        return fileContents;
//
//    }



    public default void printContents(ArrayList<String> fileContents){
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.println(fileContents.get(i));
        }
    }





}
