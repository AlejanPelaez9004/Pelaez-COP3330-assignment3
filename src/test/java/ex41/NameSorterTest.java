package ex41;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void parseAndSortNames() throws FileNotFoundException {
        FileHandler fHandler = new FileHandler();
        Scanner scan = new Scanner(fHandler.GetNames());

        assertNotNull(NameSorter.ParseAndSortNames(scan));
    }
}