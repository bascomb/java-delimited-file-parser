package com.bascomb.application.lineparser;

import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class DelimitedLineParser implements LineParser {

    private final String delimiter;

    public DelimitedLineParser(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Gets the tokens from a String of text based on the delimiter.
     *
     * @param nextLine Input String representing line of delimited text.
     * @return String array of delimited tokens.
     */
    @Override
    public String[] getTokens(String nextLine) {
        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        settings.getFormat().setDelimiter(delimiter);
        CsvParser parser = new CsvParser(settings);
        return parser.parseLine(nextLine);
    }
}
