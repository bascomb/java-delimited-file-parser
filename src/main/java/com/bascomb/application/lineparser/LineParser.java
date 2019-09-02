package com.bascomb.application.lineparser;

/**
 * Interface for parsing single lines of text into tokens.
 */
public interface LineParser {

    /**
     * Gets the tokens from a line of text.
     *
     * @param nextLine Input String representing line.
     * @return String array of tokens in line.
     */
    String[] getTokens(String nextLine);
}
