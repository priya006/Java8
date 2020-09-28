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

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
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
