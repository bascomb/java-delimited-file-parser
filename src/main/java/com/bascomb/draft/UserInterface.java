package com.bascomb.draft;

import com.bascomb.FileParser;
import com.bascomb.UserInputInterpreter;

public class UserInterface {

    UserInterface() {
        interpreter = new UserInputInterpreter();
    }

    private UserInputInterpreter interpreter;

    public void welcome() {
        System.out.println("Welcome to the User Interface for the File Parser API.");
    }
    public void promptFile() {
        System.out.println("Enter File to Parse: ");
    }

    public void controller() {
        String path;
        FileWrapper file;
        String strategy
        welcome();
        promptFile();
        path = interpreter.getNext();
        file = new FileWrapper(path); //throws exception. empty file. bad path.
        promptStrategy();
        strategy = interpreter.getNext(); //throws exception. invalid format.
        createFileParser();
        while(file.hasNext()) {
            promptNextLine();
            interpreter.getNext();
            fileparser.getTokens(); //throws exception
        }
        endOfFile();
    }

    private void createFileParser() {
        FileParser fileParser;
        fileparser.setFile(file);
        fileparser.setFormat(format);
        fileParser.getTokens();
    }
}
