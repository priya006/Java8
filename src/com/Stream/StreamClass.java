package com.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4);
        Stream<Integer> stream = values.stream();

        stream.forEach(System.out::println);
         //Stream cannot be reused
        //stream.forEach(System.out::println);

        //Adding persons in a list
        ArrayList<Person> MyPersonList = new ArrayList<>();
        MyPersonList.add(new Person(22,"Priya",Gender.FEMALE));
        MyPersonList.add(new Person(24,"Priya1",Gender.MALE));
        MyPersonList.add(new Person(27,"Priya12",Gender.MALE));
        MyPersonList.add(new Person(22,"Yazhinii",Gender.FEMALE));

        for(Person person: MyPersonList){
            if(person.getGender().equals(Gender.FEMALE))
                System.out.println("Gender is female" + person);
        }

        //Filter using stream API
        List<Person> listOfFemalesUsingStream = MyPersonList.stream().filter(onepersonfromlist -> onepersonfromlist.getGender().equals(Gender.MALE)).collect(Collectors.toList());
        listOfFemalesUsingStream.forEach(System.out::println);

        //Sorting the original list using stream API
        List<Person> sortedListUsingStream = MyPersonList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        System.out.println("******** sorted list using stream by age ********");
        sortedListUsingStream.forEach(System.out::println);
    }






}
