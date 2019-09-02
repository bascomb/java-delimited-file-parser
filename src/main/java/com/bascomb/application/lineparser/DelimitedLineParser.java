package com.bascomb.application.lineparser;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

// Parses Strings that are delimited.
public class DelimitedLineParser implements LineParser {

    private final String delimiter;

    public DelimitedLineParser(String delimiter) {
        this.delimiter = delimiter;
    }

    //TODO
    @Override
    public String[] getTokens(String nextLine) {
        //return new String[] {"This","is"};
        //Implement logic to parse string with delimiter.
        TsvParserSettings settings = new TsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        TsvParser parser = new TsvParser(settings);
        return parser.parseLine(nextLine);
    }
}
