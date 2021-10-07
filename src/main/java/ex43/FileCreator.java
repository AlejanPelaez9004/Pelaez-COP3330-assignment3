/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex43;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    // Create output file and folders if asked
    public String Generate(String siteName, String author, String genJava, String genCSS) throws IOException {
        String folderPath = "src\\main\\java\\ex43\\website\\" + siteName;
        new File(folderPath).mkdirs();

        FileWriter index = new FileWriter(folderPath + "\\index.html");
        index.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <title>" + siteName +"</title>\n" +
                "<meta name=\"author\" content=\"" + author + "\">" +
                "</head>");

        if (genJava.equalsIgnoreCase("y"))
            new File(folderPath + "\\js").mkdirs();
        if (genCSS.equalsIgnoreCase("y"))
            new File(folderPath + "\\css").mkdirs();

        index.close();
        return folderPath;
    }
}