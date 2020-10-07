package com.ForEachRemaining;

import java.util.Iterator;
import java.util.Stack;

public class ForEachRemaining {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("Priya");
        stack.push("Priya12");
        stack.push("Priya123");

        Iterator<String> iterator = stack.iterator();
        iterator.forEachRemaining(element -> {
            System.out.println(element);
        });
    }
}
