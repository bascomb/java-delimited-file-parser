package com.bascomb.test.fixedwidth;

import com.bascomb.application.lineparser.FixedWidthLineParser;
import com.bascomb.application.lineparser.LineParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FixedWidthTests {

    @Test
    public void testFixedWidth() throws IOException {
        int[] widths = new int[]{2, 2, 2, 2};
        String[] expected = {"AA", "BB", "CC", "DD"};
        String line = "AABBCCDD";
        LineParser lineParser = new FixedWidthLineParser(widths);
        String[] actual = lineParser.getTokens(line);
        assertEquals(expected, actual);
    }
}
