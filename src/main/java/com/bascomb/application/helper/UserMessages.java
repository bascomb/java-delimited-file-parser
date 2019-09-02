package com.bascomb.application.helper;

import java.util.Arrays;

/**
 * Helper Class for CLI.
 */
public class UserMessages {

    public static void welcome() {
        System.out.println("Welcome to the User Interface for the File Parser API.");
    }

    public static void promptIsFixedWidth() {
        System.out.println("Process as Fixed Width (True/False) : ");
    }

    public static void promptFixedWidthValues() {
        System.out.println("Provide Fixed Width Values (eg '5 5 5 5') : ");
    }

    public static void promptNextLine() {
        System.out.println("Get next line?");
    }

    public static void printTokens(String[] tokens) {
        System.out.println(Arrays.toString(tokens));
    }

    public static void endOfFile() {
        System.out.println("End of File.");
    }

    public static void promptFixedWidthCount() {
        System.out.println("How many integers do you want in the array?");
    }

    public static void ErrorBooleanExpected() {
        System.out.println("Please input a boolean value");
    }

}
