package com.bascomb.application;

/**
 * This Application is an API for parsing files to Lists of Tokens.
 * Arugments:
 * 1. File Path String
 */
public class App {

    public static void main(String[] args) {
        if(args.length != 1) throw new IllegalArgumentException("You must provide one argument which is a valid path to a file.");
        Controller controller = new Controller();
        Controller.execute(args[0]);
    }
}
