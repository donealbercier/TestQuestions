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

public class FileReaderTest {

    @Before
    public void setUp() throws IOException{

    }

    @Test
    public void createFileTest() throws IOException{
        assertTrue(FileReader.createFile("create.txt"));
        assertFalse(FileReader.createFile("create.txt"));

    }

    @Test
    public void deleteFileTest() throws IOException{
        assertTrue(FileReader.deleteFile("create.txt"));
        assertFalse(FileReader.deleteFile("create.txt"));
    }

    @Test
    public void readFileTest() throws IOException{
        System.out.println(FileReader.readFile("test.txt"));

    }

    @Test
    public void readIncorrectFile() throws IOException{

    }
}
