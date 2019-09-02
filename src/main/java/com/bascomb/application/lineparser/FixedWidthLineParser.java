package com.bascomb.application.lineparser;

import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;

public class FixedWidthLineParser implements LineParser {

    private final int[] fixedWidthVals;

    public FixedWidthLineParser(int[] fixedWidthVals) {
        this.fixedWidthVals = fixedWidthVals;
    }

    //TODO
    @Override
    public String[] getTokens(String nextLine) {
        // creates the sequence of field lengths in the file to be parsed
        FixedWidthFields lengths = new FixedWidthFields(fixedWidthVals);

        // creates the default settings for a fixed width parser
        FixedWidthParserSettings settings = new FixedWidthParserSettings(lengths);

        //sets the character used for padding unwritten spaces in the file
        settings.getFormat().setPadding(' ');
        settings.getFormat().setLineSeparator("\n");

        // creates a fixed-width parser with the given settings
        FixedWidthParser parser = new FixedWidthParser(settings);

        return parser.parseLine(nextLine);
    }
}
