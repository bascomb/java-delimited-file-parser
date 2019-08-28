package com.bascomb.files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.util.ArrayList;
import java.util.List;

public class DelimitedFile extends Files{



    public DelimitedFile(String arg) {
        super(arg);
    }

    @Override
    List<String> readLineAsList(String line) {
        return null;
    }

}
