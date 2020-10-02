package com.Varargs;

public class VarargsExample {
    public static void main(String[] args) {


        System.out.println(VarargsExample.add(2,8,9,10));
        System.out.println(  VarargsExample.add(2,4));


    }

    public static  int add(int ... args){
        int sum =0;
        for(int x: args) {
            sum += x;

        }
        return  sum;
    }
}
