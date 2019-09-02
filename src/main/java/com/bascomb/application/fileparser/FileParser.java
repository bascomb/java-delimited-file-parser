package com.bascomb.application.fileparser;

import com.bascomb.application.format.Format;
import com.bascomb.application.lineparser.LineParser;

//Manages file processing. Interface to Parser
public abstract class FileParser {


    LineParser lineParser;

    //TODO
    public FileParser() {
    }

    //abstract void setParser(Parser parser);

    public void getTokens(String nextLine, Format format) {

    }

    public String[] getTokens(String nextLine) {
        return lineParser.getTokens(nextLine);
    }
}
