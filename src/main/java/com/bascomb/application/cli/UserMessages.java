package com.bascomb.application.cli;

import java.util.Arrays;

public class UserMessages {


    public static void welcome() {
        System.out.println("Welcome to the User Interface for the File Parser API.");
    }

    public static void promptFile() {
        System.out.println("Enter File to Parse: ");
    }

    public static void promptIsFixedWidth() {
        System.out.println("Process as Fixed Width (True/False) : ");
    }

    public static void promptFixedWidthValues() {
        System.out.println("Provide Fixed Width Values (eg '5 5 5 5' : ");
    }

    static void promptNextLine() {
        System.out.println("Get next line?");
    }

    static void printTokens(String[] tokens) {
        System.out.println(Arrays.toString(tokens));
    }

    static void endOfFile() {
        System.out.println("End of File.");
    }

    public static void promptFixedWidthCount() {
        System.out.println("How many integers do you want in the array?");
    }

    public static void ErrorBooleanExpected() {
        System.out.println("Please input a boolean value");
    }

    private void promptStrategy() {
        System.out.println("Strategy?");
    }
}
