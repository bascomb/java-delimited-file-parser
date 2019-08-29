package com.bascomb.files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.text.StringTokenizer;

import java.util.ArrayList;
import java.util.List;

public class    DelimitedFile extends Files{



    public DelimitedFile(String arg) {
        super(arg);
    }

    @Override
    List<String> readLineAsList(String line) {
        List<String> tokens = null;
        String delim = " ";
        StringTokenizer strTokenizer = new StringTokenizer(line, delim);
        tokens = strTokenizer.getTokenList();
        return tokens;
    }

}
