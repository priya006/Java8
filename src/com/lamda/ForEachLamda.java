package com.lamda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ForEachLamda {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Priya");
        list.add("Priya1");
        list.add("Priya2");
        list.add("Priya3");
        list.forEach(names -> System.out.println(names));

    }
}
