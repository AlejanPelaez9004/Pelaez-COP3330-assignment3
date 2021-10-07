/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex43;

import java.io.IOException;
import java.util.Scanner;

public class WebsiteGenerator {
    /*
    Prompt user for information about site and store in strings
    String siteName;
    String author;

    Prompt user if they want Java and/or CSS folder(s).
    String genJavaFolder;
    String genCSSFolder;

    Hand options over off to FileCreator
    FileCreator fCreator = new FileCreator();
    fCreator.GenerateOptions(all strings);

    Receive folder path name to print output
    String folderPath = returned folder path from FileCreator;
    PrintOutput(String folderPath);
     */
    private static String siteName, author, genJavaFolder, genCSSFolder;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        PromptUser();

        FileCreator fCreator = new FileCreator();
        String folderPath = fCreator.Generate(siteName, author, genJavaFolder, genCSSFolder);

        PrintOutput(folderPath);
    }

    public static void PromptUser()
    {
        System.out.print("Site name: ");
        siteName = scan.nextLine();
        System.out.print("Author: ");
        author = scan.nextLine();
        System.out.print("Do you want a folder for Javascript? (y/n)");
        genJavaFolder = scan.next();
        System.out.print("Do you want a folder for CSS? (y/n)");
        genCSSFolder = scan.next();
    }

    private static void PrintOutput(String folderPath)
    {
        System.out.println("Created " + folderPath);
        System.out.println("Created" + folderPath + "\\index.html");

        if (genJavaFolder.equalsIgnoreCase("y"))
            System.out.println("Created " + folderPath + "\\js\\");
        if (genCSSFolder.equalsIgnoreCase("y"))
            System.out.println("Created " + folderPath + "\\css\\");
    }
}
