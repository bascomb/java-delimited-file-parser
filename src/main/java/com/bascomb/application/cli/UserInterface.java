package com.bascomb.application.cli;


public class UserInterface {

//    private FileParser fileParser;
//    String path;
//    FileInterface file;
//    Strategy strategy;
//
//    UserInterface() {
//        interpreter = new UserInputInterpreter();
//    }
//
//    private UserInputInterpreter interpreter;
//
//    public void welcome() {
//        System.out.println("Welcome to the User Interface for the File Parser API.");
//    }
//    public void promptFile() {
//        System.out.println("Enter File to Parse: ");
//    }
//
//    public void controller() {
//
//        welcome();
//        promptFile();
//
//        path = interpreter.getNext();
//        file = new aFile(path); //throws exception. empty file. bad path.
//
//        promptStrategy();
//
//        strategy = new Strategy(interpreter.getNext()); //throws exception. invalid format.
//
//        createFileParser();
//
//        while(file.hasNext()) {
//            promptNextLine();
//            interpreter.getNext();
//            printTokens(fileParser.getTokens(file.nextLine(), strategy)); //throws exception
//        }
//
//        endOfFile();
//    }
//
//    private void promptStrategy() {
//        System.out.println("Strategy?");
//    }
//
//    private void promptNextLine() {
//        System.out.println("Get next line?");
//    }
//
//    private void printTokens(String[] tokens) {
//        System.out.println(tokens);
//    }
//
//    private void endOfFile() {
//        System.out.println("End of File.");
//    }
//
//    private void createFileParser() {
//        fileparser.setFile(file);
//        fileparser.setFormat(format);
//        fileParser.getTokens();
//    }
}
