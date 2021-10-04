/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    // return target file
    public File GetNames() throws FileNotFoundException {
        return new File("src\\main\\java\\ex41\\exercise41_input.txt");
    }

    // Create output file and store sorted names
    public void PrintOutputToFile(ArrayList<String> sortedNames) throws IOException {
        FileWriter writer = new FileWriter("src\\main\\java\\ex41\\exercise41_output.txt");
        for (String sortedName : sortedNames)
            writer.write(sortedName + "\n");
        writer.close();
    }
}
