package com.SingletonDesignPattern;

//Below is the singletin class which lets people to create only instance
public class SingleClassExample {

    //Create a static object
    static SingleClassExample singleClassExampleObject = new SingleClassExample();
    //Constructor which is private
    private SingleClassExample(){



    }

    //Create a public method
    public static SingleClassExample getInstance(){

        return singleClassExampleObject;

    }

    //Public method
    public void showMessage(){
        System.out.println("This method could be accessed by signleton object only once");
    }




    public static void main(String[] args) {

    //Instantiate object
       SingleClassExample.getInstance().showMessage();


    }

}
