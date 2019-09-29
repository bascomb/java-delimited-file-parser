package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.LineParser;

/**
 * Interface to parsing a given file.
 * Implement this class to define a specific file parser.
 */
public interface FileParser {

    /**
     * Interface to LineParser getTokens method.
     *
     * @return Text Tokens.
     * */
    String[] getNextLine();

    boolean hasNext();
}
