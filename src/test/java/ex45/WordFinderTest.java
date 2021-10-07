/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex45;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void createOutput() throws IOException {
        File file = new File("src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> inputFileStrings = new ArrayList<>();
        ArrayList<String> newInputStrings = new ArrayList<>();
        while (scan.hasNextLine())
            inputFileStrings.add(scan.nextLine());

        for (String inputFileString : inputFileStrings)
            newInputStrings.add(inputFileString.replace("utilize", "use"));

        String outputName = "output";
        assertEquals("src\\main\\java\\ex45\\output.txt", WordFinder.CreateOutput(outputName, newInputStrings));
    }
}