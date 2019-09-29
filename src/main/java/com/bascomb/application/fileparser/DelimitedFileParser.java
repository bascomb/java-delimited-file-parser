package com.bascomb.application.fileparser;

import com.bascomb.application.file.IterableFile;
import com.bascomb.application.lineparser.DelimitedLineParser;
import com.bascomb.application.lineparser.LineParser;

import java.io.IOException;

/**
 * File parser for parsing delimited text files.
 * Extends FileParser.
 * Delimiter field defines delimiter of tokens.
 */
public class DelimitedFileParser implements FileParser {

    private String delimiter;
    private final LineParser lineParser;
    //Fixed width formatting
    private IterableFile file;

    public DelimitedFileParser(String path, String delimiter) throws IOException {
        this.delimiter = delimiter;
        this.lineParser = new DelimitedLineParser(delimiter);
        this.file = new IterableFile(path);
    }

    @Override
    public String[] getNextLine() {
        return lineParser.getTokens(file.nextLine());
    }

    @Override
    public boolean hasNext() {
        return file.hasNext();
    }

    /**
     * Initializes delimiter format and sets LineParser to DelimitedLineParser.
     *
     * @param delimiter
     */
}
