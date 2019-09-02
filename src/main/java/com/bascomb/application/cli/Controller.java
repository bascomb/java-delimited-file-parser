package com.bascomb.application.cli;

import com.bascomb.application.file.ParsableFile;
import com.bascomb.application.fileparser.DelimitedFileParser;
import com.bascomb.application.fileparser.FileParser;
import com.bascomb.application.fileparser.FixedWidthFileParser;
import com.bascomb.application.format.Format;
import com.bascomb.application.helper.Helper;

import java.util.Scanner;

/**
 * Processes user input and interfaces with parser.
 */
public class Controller {

    public Controller(String path) {
        this.path = path;
        file = new ParsableFile(path); //throws exception. empty file. bad path.
        scanner = new Scanner(System.in);
    }

    ParsableFile file;
    FileParser fileParser;
    String path;
    Scanner scanner;

    //Application Flow
    public void execute() {

        UserMessages.welcome();
        UserMessages.promptIsFixedWidth();
        boolean isFixedWidith = false;
        if (scanner.hasNextBoolean()) { //throws exception. invalid format.
            isFixedWidith = scanner.nextBoolean();
        } else {
            System.out.println("Please input a boolean value");
        }

        if (isFixedWidith) {
            UserMessages.promptFixedWidthValues(); //TODO
            System.out.println("hoW many integeres do you want in the array?");
            //Integer[] fixedWidthVals = null; //TODO
            int count = scanner.nextInt();
            System.out.println("count is: " + count);
            int[] fixedWidthVals = new int[count];
            for (int i = 0; i < count; i++)
                fixedWidthVals[i] = scanner.nextInt();

            //format = new FixedWidthFormat(fixedWidthVals);//TODO
            fileParser = new FixedWidthFileParser(fixedWidthVals);

        } else {
            //derive extension
            String delimiter = Helper.deriveDelimiter(path);
            //format = new ExtensionFormat(delimiter); //TODO
            fileParser = new DelimitedFileParser(delimiter);
        }

        parseFile();

        UserMessages.endOfFile();
    }

    private void parseFile() {
        while (file.hasNext()) {
            UserMessages.promptNextLine();
            scanner.nextLine();
            UserMessages.printTokens(fileParser.getTokens(file.nextLine())); //throws exception
        }
    }

}
