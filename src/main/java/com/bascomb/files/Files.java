package com.bascomb.files;

import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public abstract class Files {

    private static Map<String, String> extensionDelimiterMap = getMap();;

    public Files(String path) throws IOException {
        this.extension = path.substring(path.lastIndexOf('.')+1);
        this.path = path;
        this.delimiter = getDelimiterFromExt(extension);
        this.allLines = new ArrayList<List<String>>();
        this.file = new File(this.path);
        this.lineIndex = 0;
        this.it = FileUtils.lineIterator(file, "UTF-8");
    }

    /**
     * Get map representing mapping of file extensions to delimiters.
     * Key is extension.
     * @return HashMap representation populated with data.
     */
    private static Map<String,String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("tab", "\t");
        map.put("csv", ",");
        map.put("fixed", " ");
        map.put("pipe", "|");
        map.put("space", " ");

        return map;
    }

    /**
     * This method maps an extension to a delimiter that can be used to parse the file.
     * @param extension
     * @return String representing delimiter.
     */
    private String getDelimiterFromExt(String extension) {
        if(extensionDelimiterMap.containsKey(extension)) {
            String delimiter = extensionDelimiterMap.get(extension);
        } else {
            throw new RuntimeException("Extension not found.");
        }
        return delimiter;
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
    private List<List<String>> allLines;

    /**
     * This method is used to read the next line from a file as a list of tokens.
     * @return Returns next line as a List of Strings
     */
    public List<String> readLine() {
        List<String> line = readLineAsList(ReadLineAsString());
        allLines.add(line);
        return line;
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
