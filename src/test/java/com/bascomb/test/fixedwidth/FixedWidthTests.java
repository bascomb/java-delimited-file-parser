package com.bascomb.test.fixedwidth;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FixedWidthTests {

    @Test
    public void testFixedWidth() throws IOException {
        FileParser fileParser = new FixedWidthFileParser(new int[]{2,2,2,2});
        String[] expected = {"AA", "BB", "CC", "DD"};
        String path = "src/test/resources/test-fixed-width.fw";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }
}
