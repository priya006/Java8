package com.Interface;

public class DriverClass {

    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        Series interfaceObject = new Class2();

       int sum = interfaceExample.add(10);
       int sumUsingInterface = interfaceObject.add(1);
       System.out.println(sum);
        System.out.println(sumUsingInterface);

        System.out.println(Series.MAX);
        System.out.println(Series.ERRORMSG);
        System.out.println(interfaceObject.printStuff());
    }
}
