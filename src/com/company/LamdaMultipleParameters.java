package com.company;

interface sconcatinterface{
     String sconcat (String str1, String str2);
}

public class LamdaMultipleParameters {

    public static void main(String[] args) {
        //In the left the paramter is defined. Right is the method body
        sconcatinterface sconcatObject = (param1, param2) -> param1 + param2;
        System.out.println("Result: "+sconcatObject.sconcat("Priya ", "Ananadha"));

    }
}
