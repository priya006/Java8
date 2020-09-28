package com.company;

@FunctionalInterface
interface MyFunctionalInterface{
     int calculate(int i);
}

public class LamdaWithSingleParameter {
    public static void main(String[] args) {
        MyFunctionalInterface interfaceObject = i ->  i + 10;
        System.out.println(interfaceObject.calculate(5));
    }
}
