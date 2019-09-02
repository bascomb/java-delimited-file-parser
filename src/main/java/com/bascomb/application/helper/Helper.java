package com.bascomb.application.helper;

import java.util.HashMap;
import java.util.Map;

/**
 * Helper class:
 * Provides method for deriving a delimiter from a file extension.
 */
public class Helper {

    private static Map<String, String> extensionDelimiterMap = getMap();

    /**
     * Get map representing mapping of file extensions to delimiters.
     * Key is extension.
     *
     * @return HashMap representation populated with data.
     */
    private static Map<String, String> getMap() {
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
     *
     * @param extension
     * @return String representing delimiter.
     */
    private static String getDelimiterFromExt(String extension) {
        String delimiter;
        if (extensionDelimiterMap.containsKey(extension)) {
            delimiter = extensionDelimiterMap.get(extension);
        } else {
            throw new RuntimeException("Extension not found.");
        }
        return delimiter;
    }

    /**
     * Gets the delimiter from file extension.
     *
     * @param path File with delimiter to parse.
     * @return String of file extension.
     */
    public static String deriveDelimiter(String path) {

        String extension = path.substring(path.lastIndexOf('.') + 1);
        return getDelimiterFromExt(extension);
    }
}
