package com.bascomb.application.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

//File to be parsed.
//Interface to file contents.

/**
 * Represents a File that is parsable by the application.
 */
public class IterableFile {

    File file;

    LineIterator it;

    /**
     * Initializes File from file path.
     * Initializes iterator for reading the file line by line.
     *
     * @param path File path
     * @throws IOException if iterator cannot be set.
     */
    public IterableFile(String path) throws IOException {
        file = new File(path);
        it = FileUtils.lineIterator(file, "UTF-8");
    }

    /**
     * Gets the next line of the file.
     *
     * @return next line of file
     */
    public String nextLine() {
        return it.nextLine();
    }

    /**
     * Returns if the file has another line to read.
     *
     * @return True if the file has another line. False Otherwise.
     */
    public boolean hasNext() {
        return it.hasNext();
    }
}
