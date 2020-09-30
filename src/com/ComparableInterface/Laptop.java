package com.ComparableInterface;

public class Laptop implements Comparable<Laptop> {

    int price;
    String brand;
    int ram;

    //Constructor
    public  Laptop(int price, String brand, int ram){
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

    @Override
    public int compareTo(Laptop laptop) {
        if(this.price > laptop.price)
        return 1;
        else
        return 0;
    }
}
