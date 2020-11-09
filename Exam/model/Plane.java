package com.model;

public class Plane {

    private String model="Boeing";
    private String country="France";
    private int year=2015;
    private double hours=44;
    private boolean military=false;
    private String engineType="eng";
    private double weight=5000;
    private double wingspan=46;
    private double topSpeed=800;
    private int numOfSeats=170;
    private double cost=1567850;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() != 0)
            this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() != 0)
            this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020)
            this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) 
    {
        if (hours >= 0 && hours <= 10000)
            this.hours = hours;
    }

    public boolean isMilitary() 
    {
        return military;
    }

    public void setMilitary(boolean military) 
    {
        this.military = military;
    }

    public String getEngineType()
    {
        return engineType;
    }

    public void setEngineType(String engineType)
    {
        if(engineType.length()!=0)
            this.engineType = engineType;
    }

    public double getWeight() 
    {
        return weight;
    }

    public void setWeight(double weight) 
    {
        if(weight>=1000&&weight<=160000)
            this.weight = weight;
    }

    public double getWingspan() 
    {
        return wingspan;
    }

    public void setWingspan(double wingspan) 
    {
        if(wingspan>=10&&wingspan<=45)
            this.wingspan = wingspan;
    }

    public double getTopSpeed() 
    {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed)
    {
        if(topSpeed>=0&&topSpeed<=1000)
            this.topSpeed = topSpeed;
    }

    public int getNumOfSeats()
    {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) 
    {
        if(numOfSeats>=0)
            this.numOfSeats = numOfSeats;
    }

    public double getCost() 
    {
        return cost;
    }

    public void setCost(double cost) 
    {
        if(cost>=0)
            this.cost = cost;
    }
}
