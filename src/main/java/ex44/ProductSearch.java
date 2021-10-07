/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex44;

import com.google.gson.Gson;
import ex43.FileCreator;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProductSearch {
    /*
        Create a Class to hold product information
        class Product

        Read input file by reader.
        Reader reader;

        Use gson for JSON deserialization from input file
        Gson gson = new Gson();

        Deserialize JSON using product class
        Product product = gson.fromjson(scan, Product.class);

        Prompt user for item
        System.out.print("What is the product name? ");

        Search for item by name
        product.name.equalsIgnoreCase(searchTerm);

        If found, print entire product details, if not then print error message
        print(name, price quantity);
        or
        print(not found in inventory);
     */

    public static void main(String[] args) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get("src\\main\\java\\ex44\\exercise44_input.json"));
        Gson gson = new Gson();

        Root root = gson.fromJson(reader, Root.class);

        String searchTerm = PromptUser();
        SearchProductsByName(searchTerm, root);
    }

    public static String PromptUser()
    {
        System.out.print("What is the product name? ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static String SearchProductsByName(String searchTerm, Root root)
    {
        for (int i = 0; i < root.products.size(); i++)
        {
            Product product = root.products.get(i);
            if (product.GetName().equalsIgnoreCase(searchTerm))
            {
                String name = product.GetName();
                float price = product.GetPrice();
                int quantity = product.GetQuantity();
                String result = "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
                System.out.print(result);
                return result;
            }
        }

        System.out.print("Sorry, that product was not found in our inventory.\n");
        String newSearchTerm = PromptUser();
        SearchProductsByName(newSearchTerm, root);
        return "";
    }
}
