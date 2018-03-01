package RecipeReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RecipeReaderTest {

    @Before
    public void setUp() throws IOException{

    }

//    @Test(expected=IndexOutOfBoundsException.class)
//    public void testIndexOutOfBoundsException() throws IOException {
//        RecipeReader.readFile("sdfs.txt");
//    }


    @Test
    public void testRead() throws IOException {
        assertEquals("Thai Red Curry",RecipeReader.readFile("test.txt").get(1));

    }

    @Test
    public void testCreate()throws IOException{
        Path created = Paths.get("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create.txt");
        RecipeReader.createFile("create.txt");
        assertEquals(true,Files.exists(created));
    }

    @Test
    public void testChangeFileStart(){
        RecipeReader.fileLocationStart="C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\";
        String testLocation  ="C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\";
        assertEquals(RecipeReader.fileLocationStart, testLocation);
        RecipeReader.fileLocationStart="C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\";
    }

    @Test
    public void testFindFileMarkers(){
        ArrayList<String> markerTest = new ArrayList<String>();
        markerTest.add("recipe");
//        markerTest.add("-=-=-=");
//        markerTest.add("Hello");
        markerTest.add("ingredients");
        markerTest.add("instructions");
        int[] test = RecipeReader.findRecipeIndeces(markerTest);
        assertEquals(markerTest.get(test[0]),"recipe");
    }

    @Test
    public void testSetRecipeInformation(){
        ArrayList<String> indexTest = new ArrayList<String>();
        indexTest.add("ReCiPe");
        indexTest.add("-=-=-=");
        indexTest.add("Hello");
        indexTest.add("ingrEdients");
        indexTest.add("instructions");

        ArrayList<String> emptyIngredients = new ArrayList<String>();

        Recipe testRecipe = RecipeReader.setRecipeInformation(indexTest);
        assertEquals(testRecipe.getRecipeName(), "Hello");
        assertEquals(testRecipe.getIngredients(),emptyIngredients);

    }


    @After
    public void breakDown() throws IOException{
       RecipeReader.deleteFile("create.txt");
    }
}
