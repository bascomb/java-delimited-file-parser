package com.bascomb;

import java.util.Scanner;

public class UserInputInterpreter {

    public UserInputInterpreter() {
        scanner = new Scanner(System.in);
    }

    private Scanner scanner;

    public String getNext() {
        return scanner.next();
    }

}
