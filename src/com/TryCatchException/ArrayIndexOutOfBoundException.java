package com.TryCatchException;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);
        }catch (Exception e)
        {
            System.out.println("An Exception caught");
        }
    }
}
