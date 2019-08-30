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
    public static void main( String[] args )
    {
        FileParser fileParser = new FileParser();

    }

    private void startApplication () {
        String path = args[0];
        System.out.println(path);
        File file = new File(path);
        try {
            List<String> lines = FileUtils.readLines(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
