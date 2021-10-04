/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex41;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NameSorter {
    /*
    Import the file using the FileHandler class.
    FileHandler fHandler = new FileHandler();

    Get the names into an ArrayList.
    ArrayList<String> list = fHandler.GetNames();

    Sort names by last then first.
    call SortNames() function;

    Get output to fileHandler.
    fHandler.PrintOutput();
     */

    public static void main(String[] args) throws IOException {
        FileHandler fHandler = new FileHandler();
        Scanner scan = new Scanner(fHandler.GetNames());

        ArrayList<String> sorted = ParseAndSortNames(scan);
        fHandler.PrintOutputToFile(sorted);
    }

    public static ArrayList<String> ParseAndSortNames(Scanner scan)
    {
        ArrayList<String> names = new ArrayList<>();
        while (scan.hasNextLine())
            names.add(scan.nextLine());

        names.sort(Comparator.comparing(String :: toString));
        return names;
    }
}
