package RecipeReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {

    String fileName = "";


    void writeToFile(String fileName, List<String> list) throws IOException {
        Path file = Paths.get(fileName);
        list.add(0, "\n ---------Instructions--------");
        Files.write(file, list, Charset.forName("UTF-8"));
        System.out.println(Files.size(file));

    }
}
