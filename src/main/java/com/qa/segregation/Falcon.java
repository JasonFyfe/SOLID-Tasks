package com.qa.segregation;

public class Falcon implements EggLayingCreature, FlyingCreature
{
    private String currentLocation;
    private int numberOfEggs;

    public Falcon(int initialEggCount)
    {
        this.setNumberOfEggs(initialEggCount);
    }

    // Interaction with Interface
    public void fly()
    {
        this.setCurrentLocation("High above the clouds");
    }

    // Interaction with Interface
    public void layEggs()
    {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    public String getCurrentLocation()
    {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation)
    {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs()
    {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs)
    {
        this.numberOfEggs = numberOfEggs;
    }
}
