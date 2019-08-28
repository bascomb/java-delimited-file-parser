package com.bascomb.files;

import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Files {


    public Files(String path) {
        this.extension = "tab";
        this.path = path;
        this.delimiter = "\t";
        this.lines = new ArrayList<String>();
        this.file = new File(this.path);
        this.lineIndex = 0;
        try {
            this.it = FileUtils.lineIterator(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int lineIndex;

    private final File file;

    private LineIterator it;

    /**
     * File Name Extension
     */
    private final String extension;

    /**
     * Delimiter in file
     */
    private final String delimiter;

    /**
     * Path to the file
     */
    private final String path;

    /**
     * List of lines in File. New lines are added as they are read.
     */
    private List<String> lines;

    /**
     * This method is used to read the next line from a file as a list of tokens.
     * @return Returns next line as a List of Strings
     */
    public List<String> readLine() {
        return readLineAsList(ReadLineAsString());
    }

    public Integer getCurrentLineNumber() {

        return lineIndex + 1;
    }

    /**
     * This method parses the tokens from the String line.
     * @param line
     * @return
     */
    abstract List<String> readLineAsList(String line);

    private String ReadLineAsString() {
        if(it.hasNext()) return it.nextLine();
        else throw new RuntimeException("End of File");
    }

    private boolean hasNextLine() {
        return it.hasNext();
    }

}
