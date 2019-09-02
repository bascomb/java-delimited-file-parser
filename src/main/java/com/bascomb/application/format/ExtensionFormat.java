package com.bascomb.application.format;

public class ExtensionFormat extends Format {
    private final String delimiter;

    public ExtensionFormat(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
