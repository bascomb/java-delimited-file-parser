package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.DelimitedLineParser;

public class DelimitedFileParser extends FileParser {

    String delimiter;

    public DelimitedFileParser(String delimiter) {
        this.lineParser = new DelimitedLineParser(delimiter);
    }
}
