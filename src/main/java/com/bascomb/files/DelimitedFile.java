package com.bascomb.files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.text.StringTokenizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DelimitedFile is the implementation of the Abstract Class, Files.
 * It represents a file with delimited lines that are read line by line.
 * The readLineAsList method given a string should parse the string according to the defined delimiter.
 */
public class DelimitedFile extends Files{

    public DelimitedFile(String arg) throws IOException {
        super(arg);
    }

    /**
     * Reads a given line, parsing it from String to a list of tokens based on the defined delimiter.
     *
     * @param line line of the file as a string.
     * @return list of tokens parsed from delimited line parameter.
     */
    @Override
    List<String> readLineAsList(String line) {
        List<String> tokens = null;
        StringTokenizer strTokenizer = new StringTokenizer(line, this.getDelimiter());
        tokens = strTokenizer.getTokenList();
        return tokens;
    }

}
