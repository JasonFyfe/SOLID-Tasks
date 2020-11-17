package com.qa.single;

public class Car
{
    private String colour;
    private String model;
    private int mileage;
    private double tyrePressure;
    private int suspensionHeight;

    public Car(String colour, String model, int mileage, double tyrePressure, int suspensionHeight)
    {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
        this.tyrePressure = tyrePressure;
        this.suspensionHeight = suspensionHeight;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getMileage()
    {
        return mileage;
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage;
    }

    public double getTyrePressure()
    {
        return tyrePressure;
    }

    public void setTyrePressure(double tyrePressure)
    {
        this.tyrePressure = tyrePressure;
    }

    public int getSuspensionHeight()
    {
        return suspensionHeight;
    }

    public void setSuspensionHeight(int suspensionHeight)
    {
        this.suspensionHeight = suspensionHeight;
    }
}
