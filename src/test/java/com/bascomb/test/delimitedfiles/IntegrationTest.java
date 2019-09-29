package com.bascomb.test.delimitedfiles;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import com.bascomb.application.helper.Helper;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void testCSV() throws IOException {
        String path = "src/test/resources/test-csv-file.csv";
        String delimiter = Helper.deriveDelimiter(path);
        FileParser fileParser = new DelimitedFileParser(path, delimiter);
        String[] expected = {"This", "is", "a", "test"};

        List<String[]> list = new ArrayList<String[]>();
        list.add(fileParser.getNextLine());

        assertEquals(expected, list.get(0));
    }

    @Test
    public void testFixedWidth() throws IOException {
        String path = "src/test/resources/test-fixed-width.fw";
        int[] widths = new int[]{2, 2, 2, 2};
        FileParser fileParser = new FixedWidthFileParser(path, widths);
        String[] expected = {"AA", "BB", "CC", "DD"};

        List<String[]> list = new ArrayList<String[]>();
        list.add(fileParser.getNextLine());

        assertEquals(expected, list.get(0));
    }
}
