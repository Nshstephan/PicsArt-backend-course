package com.company;
public class Car {
    private int doors = 4;
    private int modelYear;
    private String brand = "BMW";
    private int price = 45500;
    private double weight = 1.5;
    boolean ignition;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }
}
