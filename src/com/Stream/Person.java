package com.Stream;

public class Person {
    int age;
    String name;
    Gender gender;



    public  Person(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    Gender getGender()
    {
        return gender;
    }
}
