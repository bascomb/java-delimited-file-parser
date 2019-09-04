package com.bascomb.test;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.helper.Helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestControllerDelimited {
    ParsableFile file;
    FileParser fileParser;
    String path;

    /**
     * Initializes Controller with file to parse.
     *
     * @param path Path of file to parse.
     */
    public TestControllerDelimited(String path) throws IOException {
        this.path = path;
        file = new ParsableFile(path); //throws exception. empty file. bad path.
        setFormat();
    }

    private void setFormat() {

        //derive extension
        String delimiter = Helper.deriveDelimiter(path);

        fileParser = new DelimitedFileParser(delimiter);
    }

    public List<String[]> parseFile() {
        List<String[]> list = new ArrayList<String[]>();
        while (file.hasNext()) {
            list.add(fileParser.getTokens(file.nextLine())); //throws exception
        }
        return list;
    }
}
