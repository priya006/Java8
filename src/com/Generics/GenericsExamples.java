package com.Generics;

//Generics Dealing with  type-safe objects
public class GenericsExamples<T> {

    T value;

    //Add a value to the variable value

   void add(T value){
        this.value = value;
    }

    // Get the value from outside the class
    T getValue()
    {
        return value;
    }


}
