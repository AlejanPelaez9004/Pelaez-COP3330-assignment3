package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileCreatorTest {

    @Test
    void generate() throws IOException {
        FileCreator fCreator = new FileCreator();
        String siteName = "SiteNameHere";
        String author = "EpicHax0r";
        String genJava = "y";
        String genCSS = "Y";

        String pathValid = fCreator.Generate(siteName, author, genJava, genCSS);
        assertEquals("src\\main\\java\\ex43\\website\\" + siteName, pathValid);
    }
}