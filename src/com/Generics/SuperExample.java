package com.Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuperExample {

    //This is less restrictive
    //List<? super Integer>
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,34,5,6);
        show(integers);

        List<? super Integer> characters = Arrays.asList('A','E','E');
        show(characters);
    }

    private static void show(List<? super  Integer> list)
    {

        list.forEach(System.out::println);

    }

}
