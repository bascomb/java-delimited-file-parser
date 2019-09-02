package com.bascomb.application;

public class Helper {

    public static String deriveDelimiter(String path) {

        return path.substring(path.lastIndexOf('.')+1);
    }
}
