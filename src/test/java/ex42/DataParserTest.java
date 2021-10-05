package ex42;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DataParserTest {

    @Test
    void assignArrayLists() throws FileNotFoundException {
        FileHandler fHandler = new FileHandler();
        Scanner scan = new Scanner(fHandler.GetFile());

        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        ArrayList<String> salary = new ArrayList<>();
        DataParser.AssignArrayLists(first, last, salary, scan);

        assertNotNull(last.get(0), "Ling");
        assertNotNull(first.get(0), "Mai");
        assertNotNull(salary.get(0), "55900");
    }
}