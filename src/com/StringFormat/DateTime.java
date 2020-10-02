package com.StringFormat;

import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Flag =  %ta %t is %t is the prefix for Date/Time conversions.
        System.out.println(String.format("The current week day in lowercase is %tA",localDateTime));
        System.out.println(String.format("The current week day is %TA",localDateTime));
        System.out.printf("The current week day is %Ta using printf",localDateTime);

        System.out.println(String.format("%n The current Year is : %1$tY  current month: %1$tm",localDateTime));

    }
}
