package com.bascomb.test.delimitedfiles;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.test.TestControllerDelimited;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testCSV() throws IOException {
        String path = "src/test/resources/test-csv-file.csv";
        TestControllerDelimited controller = new TestControllerDelimited(path);
        String[] expected = {"This", "is", "a", "test"};

        ParsableFile file = new ParsableFile(path);
        List<String[]> list = controller.parseFile();

        assertEquals(expected, list.get(0));
    }
}
