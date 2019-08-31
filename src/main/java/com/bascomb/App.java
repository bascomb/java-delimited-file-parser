package com.bascomb;

import com.bascomb.files.Files;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        parseFile(args);
    }

    private static void parseFile(String[] args) throws IOException {
        String path;
        if(args.length != 1) throw new IllegalArgumentException("You must provide one argument which is a valid path to a file.");
        path = args[0];
        FileParser fileParser;
        fileParser = new FileParser(path);
        fileParser.getNextLineAsTokens();
    }
}
