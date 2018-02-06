package RecipeReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecipeReaderTest {

    RecipeReader rr = new RecipeReader();
    @Before
    public void setUp() throws IOException{
        rr.readFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\test.txt");

    }


    @Test
    public void testRead() throws IOException {
         assertEquals("Granny's Pie",rr.printedRecipe.get(0));

    }

    @Test
    public void testCreate()throws IOException{
        Path created = Paths.get("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create.txt");
        rr.createFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create.txt");
        assertEquals(true,Files.exists(created));
    }

    @After
    public void breakDown() throws IOException{
        rr.deleteFile("C:\\Users\\donea\\IdeaProjects\\TestQuestions\\src\\RecipeReader\\create.txt");
    }
}
