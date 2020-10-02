package com.StringFormat;

import java.util.Locale;

//Syntax:    %[argument_index$][flags][width][.precision]conversion_target
public class StringFormat {

    public static void main(String[] args) {

        String firstName = "Priya";
        String middleName = "middleName";
        String lastName = "Boopathi";

        String formattedString = String.format("The name is %s %s %s", firstName, middleName, lastName);
        System.out.println(formattedString);

        //conversion_target
        String formatedCapital = String.format("The name is %S %S", firstName, middleName);
        System.out.println(formatedCapital);

        //argument_index$
        String argumentIndexFormatted = String.format("The name is %3$s %2$s %1$s", firstName, middleName, lastName);
        System.out.println(argumentIndexFormatted);

        String withnewline = String.format("The name is %3$s %2$s %1$s %n %1$s ", firstName, middleName, lastName);
        System.out.println(withnewline);

        System.out.println(String.format("4 digit number %d", 1234));
        System.out.println(String.format("This is a number %d", 1));
        //width is added as 50
        System.out.println(String.format("Width is 20 %20d", 1234));
        //Flag ',' is added
        System.out.println(String.format("Flag ',' is added %,d", 1234343434));
        //Locale.ITALY includes decimal instead of ,
        System.out.println(String.format(Locale.ITALY,"Italy %,d", 1234343434));
        //Left justified with -
        System.out.println(String.format("Left justified %-20d", 1234));

    }
}
