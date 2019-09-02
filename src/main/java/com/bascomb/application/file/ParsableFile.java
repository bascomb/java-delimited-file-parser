package com.bascomb.application.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

//File to be parsed.
//Interface to file contents.
public class ParsableFile {

    File file;

    LineIterator it;

    //TODO
    public ParsableFile(String path) {
        file = new File(path);
        try {
            it = FileUtils.lineIterator(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String nextLine() {
        return it.nextLine();
    }

    public boolean hasNext() {
        return it.hasNext();
    }
}
