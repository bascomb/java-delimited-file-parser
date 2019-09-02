package com.bascomb.test.delimitedfiles;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
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

        FileParser fileParser = new DelimitedFileParser(",");
        String[] expected = {"This", "is", "a", "test"};
        String path = "src/test/resources/test-csv-file.csv";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }

    @Test
    public void testCsvParseOneToken() throws IOException {

        FileParser fileParser = new DelimitedFileParser(",");
        String[] expected = {"This is a test"};
        String path = "src/test/resources/test-csv-file-one-token.csv";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }

    @Test
    public void testTsvParse() throws IOException {

        FileParser fileParser = new DelimitedFileParser("\t");
        String[] expected = {"This", "is", "a", "test"};
        String path = "src/test/resources/test-tsv.tab";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }
}
