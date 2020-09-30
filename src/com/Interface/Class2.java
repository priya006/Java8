package com.Interface;

public class Class2 implements Series{

    int value;
    public int add(int value) {
      return   value = value + 100;
    }

    //OVERRIDE THE INTERFACE METHOD
    public boolean printStuff(){
        System.out.println("I am from class2");

        return false;
    }



//    public int subtract() {
//       return value = value -10;
//    }
}
