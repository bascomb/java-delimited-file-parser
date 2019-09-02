package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.DelimitedLineParser;

/**
 * File parser for parsing delimited text files.
 * Extends FileParser.
 * Delimiter field defines delimiter of tokens.
 */
public class DelimitedFileParser extends FileParser {

    String delimiter;

    /**
     * Initializes delimiter format and sets LineParser to DelimitedLineParser.
     *
     * @param delimiter
     */
    public DelimitedFileParser(String delimiter) {
        this.lineParser = new DelimitedLineParser(delimiter);
    }
}
