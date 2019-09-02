package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.FixedWidthLineParser;

/**
 * File parser for parsing fixed width formatted files.
 * Extends FileParser.
 * Fixed width format is defined by Integer array of widths.
 */
public class FixedWidthFileParser extends FileParser {

    //Fixed width formatting
    private Integer[] fixedWidthVals;

    /**
     * Initializes formatting and defines LineParser as FixedWidthLineParser.
     */
    public FixedWidthFileParser(int[] fixedWidthVals) {
        this.lineParser = new FixedWidthLineParser(fixedWidthVals);
    }

}
