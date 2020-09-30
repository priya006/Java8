package com.Comparator;

import java.util.Comparator;

//If you want to create your own logic to compare two objects
public class Laptop {


    int price;
    String brand;
    int ram;

    public Laptop() {
    }
    //Constructor
    public Laptop(int price, String brand, int ram){
        this.brand = brand;
        this.price = price;
        this.ram = ram;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                '}';
    }


    //Create object for comparator interface
    //This is anonymous inner class converted with lamda functions
    Comparator<Laptop> comparatorObjectToSort = (o1, o2) ->
    {
            //Add the logic you can change if you like
            if(o1.getPrice() > o2.getPrice())
                return 1;
            else
                return -1;
    };

}

//While using comparator we dont need to implement methods of class comparable
//    @Override
//    public int compareTo(Laptop laptop) {
//        if(this.price > laptop.price)
//            return 1;
//        else
//            return 0;
//    }


