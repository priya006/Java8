package com.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverClassForLaptop {

    public static void main(String[] args) {

        //I want to add laptop to a list
        List<Laptop> listOfLaptop = new ArrayList<>();
        listOfLaptop.add(new Laptop(1200, "dell", 800));
        listOfLaptop.add(new Laptop(800, "Apple", 700));
        listOfLaptop.add(new Laptop(500, "local", 200));

        for(Laptop laptop: listOfLaptop)
            System.out.println(laptop);
        //I like to sort the listOfLaptop based on price
        Collections.sort(listOfLaptop);
    }
}
