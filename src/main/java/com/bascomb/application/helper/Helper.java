package com.bascomb.application.helper;

public class Helper {

    public static String deriveDelimiter(String path) {

        return path.substring(path.lastIndexOf('.') + 1);
    }
}
