package com.bascomb.application.cli;

import com.bascomb.application.file.IterableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import com.bascomb.application.helper.Helper;
import com.bascomb.application.helper.UserMessages;

import java.io.IOException;
import java.util.Scanner;

/**
 * API Client
 * Controls flow of parsing a given file line by line.
 * Handles User Input for defining parsing parameters.
 */
public class Controller {

    IterableFile file;
    FileParser fileParser;
    String path;
    Scanner scanner;

    /**
     * Initializes Controller with file to parse.
     *
     * @param path Path of file to parse.
     */
    public Controller(String path) throws IOException {
        this.path = path;

        scanner = new Scanner(System.in);
    }

    //Application Flow
    public void execute() throws IOException {
        boolean isFixedWidth = false;

        UserMessages.welcome();
        UserMessages.promptIsFixedWidth();

        if (scanner.hasNextBoolean()) { //throws exception. invalid format.
            isFixedWidth = scanner.nextBoolean();
        } else {
            UserMessages.ErrorBooleanExpected();
        }

        if (isFixedWidth) {
            UserMessages.promptFixedWidthCount();
            int count = scanner.nextInt();
            int[] fixedWidthVals = new int[count];

            UserMessages.promptFixedWidthValues();
            for (int i = 0; i < count; i++) {
                fixedWidthVals[i] = scanner.nextInt();
            }

            fileParser = new FixedWidthFileParser(path, fixedWidthVals);

        } else {
            //derive extension
            String delimiter = Helper.deriveDelimiter(path);

            fileParser = new DelimitedFileParser(path, delimiter);
        }

        parseFile();

        UserMessages.endOfFile();
    }

    /**
     * Parses file line by line as instructed by user.
     */
    private void parseFile() {
        while (fileParser.hasNext()) {
            UserMessages.promptNextLine();
            scanner.nextLine();
            UserMessages.printTokens(fileParser.getNextLine()); //throws exception
        }
    }

}
