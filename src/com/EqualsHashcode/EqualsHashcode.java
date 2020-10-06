package com.EqualsHashcode;

/*
equals() and hashcode() are used in Collections.
 */

public class EqualsHashcode {
    public static void main(String[] args) {

    Person firstObject = new Person("Priya","Boopathi" , 1235);
    Person secondObject = new Person("Priya","Boopathi" , 1235);
    Person thirdobject = new Person("Priya","Something" , 1235343434);

        System.out.printf("person equals to person1? %s%n",  firstObject.equals(secondObject));
        System.out.printf("secondObject equals to ThirdObject? %s%n",  secondObject.equals(thirdobject));
        System.out.printf("Hashcode of firstObject %d%n",firstObject.hashCode());
        System.out.printf("Hashcode of secondObject %d%n",secondObject.hashCode());
        System.out.printf("Hashcode of thirdobject %d ",thirdobject.hashCode());

    }
}
