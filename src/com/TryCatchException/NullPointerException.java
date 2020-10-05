package com.TryCatchException;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            int[] array = null;
            int[] array1 = {1};
             System.out.println(array[0]);
             System.out.println(array1[2]);
        }catch (java.lang.NullPointerException e) {
            //If the below line is executed it means the exception is caught
            System.out.println("Your array is null");
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Your array is out of bound");

        }catch (Exception e){
            System.out.println("generic Exception is caught");
        }
    }
}
