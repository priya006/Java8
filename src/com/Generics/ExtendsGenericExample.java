package com.Generics;

import java.util.ArrayList;

public class ExtendsGenericExample {

    //List<? extends Number>

    public static void main(String[] args) {

        //Adding floating numbers
        ArrayList<Float> float1 =new ArrayList<>();
        float1.add(123.00000f);
        float1.add(3.00000f);
        System.out.println("displaying the float= "+genericTypeAdd(float1));


        //Adding Double
        ArrayList<Double> l2=new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("displaying the sum= "+genericTypeAdd(l2));
    }

    //Float, Integer,Double extends Number
    private static  Double genericTypeAdd(ArrayList<? extends  Number> num){

        double sum=0.0;

        for(Number n:num)
        {
            sum = sum+n.doubleValue();
        }

        return sum;


    }
}
