package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDriverClass {

    public static void main(String[] args) {


        //I want to add laptop to a list
        List<Laptop> listOfLaptop = new ArrayList<>();
        listOfLaptop.add(new Laptop(1200, "dell", 800));
        listOfLaptop.add(new Laptop(800, "Apple", 1200));
        listOfLaptop.add(new Laptop(500, "local", 200));

        Laptop comparatorExampleObject = new Laptop();
        Collections.sort(listOfLaptop,comparatorExampleObject.comparatorObjectToSort);

        for(Laptop sortedLaptop: listOfLaptop)
            System.out.println("Sorted using comparator interface with my own logic: " +sortedLaptop);
    }
}
