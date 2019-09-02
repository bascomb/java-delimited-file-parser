package com.bascomb.test.tsvtest;

import com.bascomb.application.App;
import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class positive {

    /**
     *
     */
    @Test
    public void testTsvParse() {

        FileParser fileParser = new DelimitedFileParser("\t");
        String[] expected = {"This", "is", "a", "test"};
        String path = "src/test/resources/test-tsv.tab";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }
}
