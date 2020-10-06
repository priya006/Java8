package com.Predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {


        Predicate<Integer> predicate = number -> number < number +2;
        //The test method in `Predicate` Interface is invoked
        System.out.println(predicate.test(10));
    }
}
