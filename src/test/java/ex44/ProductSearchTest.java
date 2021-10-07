package ex44;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest {

    @Test
    void searchProductsByName() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get("src\\main\\java\\ex44\\exercise44_input.json"));
        Gson gson = new Gson();

        Root root = gson.fromJson(reader, Root.class);
        String searchTerm = "Thing";
        assertEquals(ProductSearch.SearchProductsByName(searchTerm, root),
                "Name: Thing\n" +
                "Price: 15.0\n" +
                "Quantity: 5");
    }
}