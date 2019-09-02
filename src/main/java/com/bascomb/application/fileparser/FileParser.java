package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.LineParser;

/**
 * Abstract class that provides interface of LineParser with ParsableFile.
 * Extend this class to define method of parsing tokens from file using a LineParser.
 */
public abstract class FileParser {

    LineParser lineParser;

    public FileParser() {
    }

    /**
     * Interface to LineParser getTokens method.
     *
     * @param nextLine String of text to parse.
     * @return Text Tokens.
     */
    public String[] getTokens(String nextLine) {
        return lineParser.getTokens(nextLine);
    }
}
