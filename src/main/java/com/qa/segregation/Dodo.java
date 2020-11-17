package com.qa.segregation;

public class Dodo implements ExtinctCreature, EggLayingCreature
{
    private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount)
    {
        this.setNumberOfEggs(initialEggCount);
    }

    // Interaction with Interface
    public void layEggs()
    {
        this.setNumberOfEggs(getNumberOfEggs() + 1);
    }

    // Interaction with Interface
    public void goExtinct()
    {
        this.setCurrentLocation("In a Museum.");
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
