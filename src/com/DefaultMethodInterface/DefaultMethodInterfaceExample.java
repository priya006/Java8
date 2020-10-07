package com.DefaultMethodInterface;


interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}



public class DefaultMethodInterfaceExample implements TestInterface {

    @Override
    public void square(int a) {
        System.out.println( a * a);


    }

    @Override
    public void show(){

        System.out.println("Overidden method");
    }

    public static void main(String[] args) {

        TestInterface testInterface = new DefaultMethodInterfaceExample();
        testInterface.square(4);

        testInterface.show();
    }


}
