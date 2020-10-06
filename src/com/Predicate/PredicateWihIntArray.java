package com.Predicate;

import java.util.function.Predicate;

public class PredicateWihIntArray {
    public static void main(String[] args) {

        int[] intArray = {1,2,4,56,7};
        Predicate<Integer> predicate = i -> i>10;
        getGreaterThan(predicate,intArray);
    }

    static void getGreaterThan(Predicate<Integer> predicate, int[] intArray){

        for(int forEachvalue: intArray) {
         //System.out.println( "is "+forEachvalue+  " greater than " +forEachvalue+ "+10 ?? " + predicate.test(forEachvalue) );
            System.out.printf("is %d greater than %d +10 ?? %b%n ",forEachvalue,forEachvalue,predicate.test(forEachvalue));
        }
    }
}
