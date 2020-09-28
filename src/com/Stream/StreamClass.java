package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4);
        Stream<Integer> stream = values.stream();

        stream.forEach(System.out::println);
         //Stream cannot be reused
        //stream.forEach(System.out::println);

    }
}
