package com.bascomb.test.tsvtest;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import org.junit.Test;

import java.io.IOException;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class TSVTests {

    /**
     *
     */
    @Test
    public void testTsvParse() throws IOException {

        FileParser fileParser = new DelimitedFileParser("\t");
        String[] expected = {"This", "is", "a", "test"};
        String path = "src/test/resources/test-tsv.tab";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEmptyFile() throws IOException {

        FileParser fileParser = new DelimitedFileParser("\t");
        String path = "src/test/resources/emptyfile.txt";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
    }
}
