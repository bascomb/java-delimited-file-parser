package com.bascomb.application;

import java.util.Scanner;

/**
 * Processes user input and interfaces with parser.
 */
public class Controller {

    

    //Application Flow
    public static void execute(String path) {
        Format format; //TODO
        ParsableFile file = new ParsableFile(path); //throws exception. empty file. bad path.

        Scanner scanner = new Scanner(System.in);
        UserMessages.welcome();
        //UserMessages.promptFile();
        UserMessages.promptIsFixedWidth();
        boolean isFixedWidith = false;
//        if (scanner.hasNextBoolean()) { //throws exception. invalid format.
//            isFixedWidith = scanner.nextBoolean();
//        } else {
//            System.out.println("Please input a boolean value");
//        }

        if(isFixedWidith) {
            UserMessages.promptFixedWidthValues(); //TODO
            Integer[] fixedWidthVals = null; //TODO
            format = new fixedWidthFormat(fixedWidthVals);//TODO

        } else {
            //derive extension
            String delimiter = Helper.deriveDelimiter(path);
            format = new ExtensionFormat(delimiter); //TODO
        }

        FileParser fileParser = new FileParser(format);

        while(file.hasNext()) {
            UserMessages.promptNextLine();
            scanner.nextLine();
            UserMessages.printTokens(fileParser.getTokens(file.nextLine())); //throws exception
            //UserMessages.printTokens(fileParser.getTokens(file.nextLine(), format)); //throws exception
        }

        UserMessages.endOfFile();
    }

}
