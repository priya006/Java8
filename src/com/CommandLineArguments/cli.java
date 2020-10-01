package com.CommandLineArguments;

//During javac compile java program -> Byte code -> Class file
//During java javaprogram.java -> The actual class file gets executed

public class cli {

    public static void main(String[] args) {

        System.out.println("Command-Line arguments are");

        // loop through all arguments
        for(String str: args) {
            System.out.println(str);
        }
    }

    }

