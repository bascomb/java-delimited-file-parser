package com.bascomb.application;

//Manages file processing. Interface to Parser
public class FileParser {


    private Parser parser;

    //TODO
    public FileParser(Format format) {
        //parser = ParserFactory.setFormat(format);
        parser = new DelimitedParser(format.getDelimiter());
    }

    public void getTokens(String nextLine, Format format) {

    }

    public String[] getTokens(String nextLine) {
        return parser.getTokens(nextLine);
    }
}
