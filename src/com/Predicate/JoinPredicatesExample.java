package com.Predicate;

import java.util.function.Predicate;

public class JoinPredicatesExample {

    public static void main(String[] args) {

        int[] intArray = {0,12,3,9,70,25,5,25,6};
        Predicate<Integer> predicateEven = i -> (i%2==0);
        Predicate<Integer> predicateGraterThan10 = i -> (i >10);
        System.out.println("Even numbers are");
        getPredicates(predicateEven,intArray);
        System.out.println("Greater than 10:");
        getPredicates(predicateGraterThan10,intArray);
        System.out.println("Greater than 10 AND even numbers");
        getPredicates(predicateEven.and(predicateGraterThan10),intArray);
        System.out.println("Greater than 10 OR even numbers");
        getPredicates(predicateEven.or(predicateGraterThan10),intArray);
        System.out.println("Not Greater than 10");
        getPredicates(predicateGraterThan10.negate(),intArray);
    }

    static void getPredicates(Predicate<Integer> predicate, int[] intArray){
        for(int forEachValue: intArray) {
           if(predicate.test(forEachValue))
            System.out.println(forEachValue);
        }

    }
}
