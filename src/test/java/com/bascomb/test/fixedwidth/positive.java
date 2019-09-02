package com.bascomb.test.fixedwidth;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class positive {

    @Test
    public void testFixedWidth() {
        FileParser fileParser = new FixedWidthFileParser(new int[] {6, 6, 6, 6});
        String[] expected = {"Green", "Red", "Blue", "Yel"};
        String path = "src/test/resources/test-fixed-width.fw";
        ParsableFile file = new ParsableFile(path);
        String[] actual = fileParser.getTokens(file.nextLine());
        assertEquals(expected, actual);
    }
}
