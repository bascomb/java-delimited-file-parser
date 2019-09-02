package com.bascomb.application.lineparser;

import com.univocity.parsers.fixed.FixedWidthFields;
import com.univocity.parsers.fixed.FixedWidthParser;
import com.univocity.parsers.fixed.FixedWidthParserSettings;

/**
 * Parses a line of text formatted in fixed width.
 */
public class FixedWidthLineParser implements LineParser {

    private final int[] fixedWidthVals;

    /**
     * Initializes the format of the fixed width.
     *
     * @param fixedWidthVals fixed width intervals
     */
    public FixedWidthLineParser(int[] fixedWidthVals) {
        this.fixedWidthVals = fixedWidthVals;
    }

    /**
     * Gets the tokens of the given text formatted in fixed widths.
     * Padding is set to blank space.
     * Line Separator is new line.
     *
     * @param nextLine Input String representing fixed width text.
     * @return Fixed Width Tokens in String array.
     */
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
