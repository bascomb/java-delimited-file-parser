package com.bascomb;

import com.bascomb.files.DelimitedFile;
import com.bascomb.files.Files;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileParser {

    private final Files file;

    public FileParser(String path) throws IOException {
        file = new DelimitedFile(path);
    }

    public List<String> getNextLineAsTokens() {
        return null;
    }
}
