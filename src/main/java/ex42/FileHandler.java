package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    // return target file
    public File GetFile() throws FileNotFoundException {
        return new File("src\\main\\java\\ex42\\exercise42_input.txt");
    }
}
