package com.Enum;

//Enumeration constant should be written in caps
//Enum is also treated like a class
public enum Days {

    MONDAY(1),TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
    int day;

    //Constructor
    Days(int day){
        this.day = day;
    }

}
