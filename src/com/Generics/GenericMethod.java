package com.Generics;

public class GenericMethod {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3};
        Character[] charArray = {'A','B','c'};

        printArray(intArray);
        printArray(charArray);
    }

    public static  <E>  void printArray(E[] arrayElemets){

        for(E element: arrayElemets){
            System.out.println(element);
        }

    }

}
