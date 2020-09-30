package com.Interface;

public interface Series {

     static final int  MAX = 10;
     static String ERRORMSG = "I am from interface";

     int add(int value);


    //default method with the keyword
    default   boolean printStuff(){
        System.out.printf("I am default method in interface");
        printMoreStuff();
            return false;
    }

     default void printMoreStuff(){
        System.out.println("More stuff");
    }
}
