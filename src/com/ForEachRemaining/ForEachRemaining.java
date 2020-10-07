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

        //We are avoiding the code  while (iterator.hasNext()) {
        //            System.out.println(iterator.next());
        //        }
        iterator.forEachRemaining(element -> {
            System.out.println(element);
        });
    }
}
