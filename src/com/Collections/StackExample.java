package com.Collections;

import java.util.*;


public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("Priya");
        stack.push("Priya12");
        stack.push("Priya123");

        Iterator<String> iterator = stack.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
