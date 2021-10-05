/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataParser {
    /*
    Create a file handler class like last example
    FileHandler fHandler = new FilerHandler();

    Use file to get first, last and salary and store in three lists
    ArrayList<String> first = new ArrayList<>();
    ArrayList<String> last = new ArrayList<>();
    ArrayList<Integer> salary = new ArrayList<>();

    Assign names and salaries into those array lists.
    while (hasnextline())
    last.add(next());
    etc

    Create header
    print(Last      First     Salary
          --------------------------);

    Print out results
    PrintOutput();
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileHandler fHandler = new FileHandler();
        Scanner scan = new Scanner(fHandler.GetFile());

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        ArrayList<String> salary = new ArrayList<>();

        AssignArrayLists(first, last, salary, scan);

        PrintOutput(first, last, salary);
    }

    public static void AssignArrayLists(ArrayList<String> first, ArrayList<String> last, ArrayList<String> salary, Scanner scan)
    {
        while (scan.hasNextLine())
        {
            scan.useDelimiter(",");
            last.add(scan.next());
            first.add(scan.next());
            scan.useDelimiter("\n");
            salary.add(scan.next());
        }
    }

    private static void PrintOutput(ArrayList<String> first, ArrayList<String> last, ArrayList<String> salary)
    {
        System.out.println("Last\t  First\t\tSalary");
        System.out.println("--------------------------");

        for (int i = 0; i < first.size(); i++)
        {
            System.out.printf("%-10s %-10s %s", last.get(i), first.get(i), salary.get(i).replace(",", ""));
        }
    }
}
