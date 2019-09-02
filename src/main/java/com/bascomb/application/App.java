package com.bascomb.application;

import com.bascomb.application.cli.Controller;

import java.io.IOException;

/**
 * This Application is an API for parsing files to Lists of Tokens.
 * It provides parsing of fixed width files and delimited files.
 * Only tested with TSV and CSV delimiters but expected to work with many others.
 * <p>
 * The file path is a required argument.
 * Prompts user to specify whether fixed width file parsing.
 * First specify fixed width array length.
 * Second specify fixed width array values.
 * Press enter to print next line.
 * Signals end of file and terminates.
 * <p>
 * This application is ready to be extended to other types of parsable formats by
 * implementing the FileParser and LineParser classes.
 *
 * @author bascomb.arnette
 */
public class App {

    /**
     * Starts application for parsing provided file.
     *
     * @param args One Required Argument File Path. Throws Exception if not.
     * @throws IOException encapsulates provided file IO errors.
     */
    public static void main(String[] args) throws IOException {
        if (args.length != 1)
            throw new IllegalArgumentException("You must provide one argument which is a valid path to a file.");
        Controller controller = new Controller(args[0]);
        controller.execute();
    }
}
