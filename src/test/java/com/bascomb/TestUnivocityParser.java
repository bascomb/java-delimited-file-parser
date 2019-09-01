package com.bascomb;

import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;


public class TestUnivocityParser {
    @Test
    public void testTSV() {
        TsvParserSettings settings = new TsvParserSettings();
        settings.getFormat().setLineSeparator("\n");

// creates a TSV parser
        TsvParser parser = new TsvParser(settings);

// parses all rows in one go.
        List<String[]> allRows = parser.parseAll(new File( "src/test/resources/test-tsv.tab"));
        System.out.println(Arrays.toString(allRows.get(0)));
    }

    @Test
    public void testFixedWidth() {
        // creates the sequence of field lengths in the file to be parsed
        FixedWidthFields lengths = new FixedWidthFields(5,3,2,5);

// creates the default settings for a fixed width parser
        FixedWidthParserSettings settings = new FixedWidthParserSettings(lengths);

//sets the character used for padding unwritten spaces in the file
        settings.getFormat().setPadding(' ');
        settings.getFormat().setLineSeparator("\n");

// creates a fixed-width parser with the given settings
        FixedWidthParser parser = new FixedWidthParser(settings);

// parses all rows in one go.
        List<String[]> allRows = parser.parseAll(new File( "src/test/resources/test-fixed-width.fw"));
        System.out.println(Arrays.toString(allRows.get(0)));
    }
}

