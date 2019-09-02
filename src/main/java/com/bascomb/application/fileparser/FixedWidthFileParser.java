package com.bascomb.application.fileparser;

import com.bascomb.application.lineparser.FixedWidthLineParser;

public class FixedWidthFileParser extends FileParser {

    private Integer[] fixedWidthVals;

    public FixedWidthFileParser(int[] fixedWidthVals) {
        this.lineParser = new FixedWidthLineParser(fixedWidthVals);
    }

}
