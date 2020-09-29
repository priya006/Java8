package com.Stream;

import java.util.*;
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
        MyPersonList.add(new Person(52,"Puppyma",Gender.FEMALE));

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
        List<Person> reversedListUsingStream = MyPersonList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        System.out.println("******** Reversed list using stream by age ********");
        reversedListUsingStream.forEach(System.out::println);

        boolean ageGreaterThan2 = MyPersonList.stream().allMatch(person -> person.getAge() > 2);
        System.out.println("*****Age greater than 2***********");
        System.out.println(ageGreaterThan2);

        System.out.println("*****Minimum list***********");
        MyPersonList.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

        //Group by Geneder and convert to a map
        System.out.println("***** Group By Gender ***********");
        Map<Gender, List<Person>> groupByGender = MyPersonList.stream().collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, people) -> {
            System.out.println(gender);
            people.forEach(System.out::println);
        } );

        //Show the oldest female from the list
        System.out.println("*******oldest female from the list*********");
        Optional<Person> maxAgeWomen = MyPersonList.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Person::getAge));
        maxAgeWomen.ifPresent(System.out::println);

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }







}
