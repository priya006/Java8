package com.Generics;

public class AccessGenericClass {

    public static void main(String[] args) {

        //Adding String
        GenericsExamples<String> genericsWithString = new GenericsExamples();
        genericsWithString.add("puppyma");
        System.out.println("WithString"+genericsWithString.getValue());


        //Adding Integer
        GenericsExamples<Integer> genericsWithInteger = new GenericsExamples();
        genericsWithInteger.add(1234);
        System.out.println("WithInteger"+ genericsWithInteger.getValue());
    }
}
