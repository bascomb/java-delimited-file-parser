package com.bascomb.application.fileparser;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.lineparser.FixedWidthLineParser;
import com.bascomb.application.lineparser.LineParser;

import java.io.IOException;

/**
 * File parser for parsing fixed width formatted files.
 * Extends FileParser.
 * Fixed width format is defined by Integer array of widths.
 */
public class FixedWidthFileParser implements FileParser {

    private final LineParser lineParser;
    //Fixed width formatting
    private int[] fixedWidthVals;
    private ParsableFile file;

    public FixedWidthFileParser(String path, int[] fixedWidthVals) throws IOException {
        super();
        this.fixedWidthVals = fixedWidthVals;
        this.lineParser = new FixedWidthLineParser(fixedWidthVals);
        this.file = new ParsableFile(path); //throws exception. empty file. bad path.
    }

    @Override
    public String[] getNextLine() {
        return lineParser.getTokens(file.nextLine());
    }

    @Override
    public boolean hasNext() {
        return file.hasNext();
    }
}
