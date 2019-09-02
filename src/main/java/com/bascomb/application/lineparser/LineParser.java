package com.bascomb.application.lineparser;

//Interface for File Parsers
public interface LineParser {
    String[] getTokens(String nextLine);
}
