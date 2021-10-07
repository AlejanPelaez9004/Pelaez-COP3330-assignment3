/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFinder {
    /*
    Open the input file.
    File file = new File(path);

    Scan input file
    Scanner scan = new Scanner(file);

    Apply scanned file test to List<String>
    while (scan.hasNexLine())
        inputFileString = scan.nextLine();

    Find and replace utilize with use
    inputFileString.get(all).replace("utilize", "use");

    Prompt for output file name
    print("What would you like the output file to be called? ");

    Create file using that file name
    FileWriter writer = new FileWriter(path + outputFileName);
    writer.write(inputFileString)
     */
    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> inputFileStrings = new ArrayList<>();
        ArrayList<String> newInputStrings = new ArrayList<>();
        while (scan.hasNextLine())
            inputFileStrings.add(scan.nextLine());

        for (String inputFileString : inputFileStrings)
            newInputStrings.add(inputFileString.replace("utilize", "use"));

        String outputName = PromptForOutputFileName();
        String filePath = CreateOutput(outputName, newInputStrings);
        System.out.println("File created: " + filePath);
    }

    public static String CreateOutput(String outputName, ArrayList<String> inputFileStrings) throws IOException {
        FileWriter writer = new FileWriter("src\\main\\java\\ex45\\" + outputName + ".txt");

        for (String inputFileString : inputFileStrings)
            writer.write(inputFileString);
        writer.close();
        return "src\\main\\java\\ex45\\" + outputName + ".txt";
    }

    private static String PromptForOutputFileName()
    {
        System.out.print("What would you like the output file to be called? ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
