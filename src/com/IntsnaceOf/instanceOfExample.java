package com.IntsnaceOf;

//intsnaceof is used for class, subclass and interface mostly in if condition
interface interfaceClass{

    public void something();
}


public class instanceOfExample implements interfaceClass {
    public static void main(String[] args) {
        String str = "Hello";

        interfaceClass interfaceObject = new instanceOfExample();
        System.out.println(str instanceof String);
        System.out.println(interfaceObject instanceof interfaceClass);
        System.out.println(interfaceObject instanceof instanceOfExample);
    }

    @Override
    public void something() {
        System.out.println("something");
    }
}
