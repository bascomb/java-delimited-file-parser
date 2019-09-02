package com.bascomb.application;

import java.util.Scanner;

public class UserInputInterpreter {

    public UserInputInterpreter() {
        scanner = new Scanner(System.in);
    }

    private static Scanner scanner;

    public static String getNext() {

        return scanner.next();
    }

}
