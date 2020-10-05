package com.TryCatchException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InputWrongValue {
    public static void main(String[] args) {
        try {
            //Gets input from the user's Keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a number!");
            int inputNumber = scanner.nextInt();
            System.out.println(inputNumber);
        }catch (Exception e)
        {
            System.out.println("A exception is occured!");
        }

    }
}
