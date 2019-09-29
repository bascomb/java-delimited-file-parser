package com.bascomb.test.delimitedfiles;

import com.bascomb.application.lineparser.DelimitedLineParser;
import com.bascomb.application.lineparser.LineParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Contains test for parsing files with delimited tokens.
 * Tests CSVs and TSVs.
 */
public class DelimitedFileTests {

    @Test
    public void testCsvParse() throws IOException {

        String[] expected = {"This", "is", "a", "test"};
        String line = "This, is, a, test";
        LineParser lineParser = new DelimitedLineParser(",");
        String[] actual = lineParser.getTokens(line);
        assertEquals(expected, actual);
    }


}
