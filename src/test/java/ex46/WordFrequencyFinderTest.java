package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {

    @Test
    void countWords() throws FileNotFoundException {
        File file = new File("src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> words = new ArrayList<>();
        while (scan.hasNextLine())
            words.add(scan.next());

        Map<String, Integer> wordCounts = WordFrequencyFinder.CountWords(words);

        assertEquals(7, wordCounts.get("badger"));
        assertEquals(2, wordCounts.get("mushroom"));
        assertEquals(1, wordCounts.get("snake"));
    }
}