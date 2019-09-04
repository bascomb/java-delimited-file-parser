package com.bascomb.application.cli;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import com.bascomb.application.helper.Helper;
import com.bascomb.application.helper.UserMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

/**
 * API Client
 * Controls flow of parsing a given file line by line.
 * Handles User Input for defining parsing parameters.
 */
@Component
public class Controller {

    ParsableFile file;
    FileParser fileParser;
    String path;
    Scanner scanner;

    /**
     * Initializes Controller with file to parse.
     *
     */
    @Autowired
    public Controller() throws IOException {
    }

    //Application Flow
    public void execute() {
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

            fileParser = new FixedWidthFileParser(fixedWidthVals);

        } else {
            //derive extension
            String delimiter = Helper.deriveDelimiter(path);

            fileParser = new DelimitedFileParser(delimiter);
        }

        parseFile();

        UserMessages.endOfFile();
    }

    /**
     * Parses file line by line as instructed by user.
     */
    private void parseFile() {
        while (file.hasNext()) {
            UserMessages.promptNextLine();
            scanner.nextLine();
            UserMessages.printTokens(fileParser.getTokens(file.nextLine())); //throws exception
        }
    }

    public void initialize(String path) throws IOException {
        this.path = path;
        file = new ParsableFile(path); //throws exception. empty file. bad path.
        scanner = new Scanner(System.in);
    }
}
