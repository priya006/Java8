package com.Enum;


public class EnumExample {
    public static void main(String[] args) {

        Days days = Days.FRIDAY;
        System.out.println(days);

        for(Days day: Days.values()){
            System.out.println(day);

        }

        System.out.println(Days.FRIDAY.day);

    }
}
