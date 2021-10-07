/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequencyFinder {
    /*
    Read in the file
    File file = new File(path);
    Scanner scan = new Scanner(file);

    Create ArrayList of String
    ArrayList<String> words = new ArrayList<>();

    Populate words
    while loop
        words.add(scan.next);

    Count each new word
    ArrayList<Int> countWords = new ArrayList<>();

    Go through each word and add it to array list if new, if not new then add it to same count
    CountWords(ArrayList<String> words);

    Print Output
    PrintOutput(ArrayList<Ints> wordCounts, ArrayList<String> uniqueWords);
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> words = new ArrayList<>();
        while (scan.hasNextLine())
            words.add(scan.next());

        Map<String, Integer> wordCounts = CountWords(words);

        PrintOutput(wordCounts);
    }

    public static Map<String, Integer> CountWords(ArrayList<String> words)
    {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.putIfAbsent(word, 0);
            counts.computeIfPresent(word, (k, v) -> v + 1);
        }
        return counts;
    }

    private static void PrintOutput(Map<String, Integer> wordCounts)
    {
        Map<String, Integer> treeMap = new TreeMap<>(wordCounts);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            StringBuilder asteriskCount = new StringBuilder();

            for (int i = 0; i < value; i++)
                asteriskCount.append("*");
            System.out.println(key + " : " + asteriskCount);
        }
    }
}
