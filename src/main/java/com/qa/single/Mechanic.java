package com.qa.single;

public class Mechanic
{
    private double tyrePressureAdjustment;
    private int suspensionAdjustment;

    public double adjustTyrePressure(double tyrePressure)
    {
        return tyrePressure + tyrePressureAdjustment;
    }

    public int adjustSuspension(int suspensionHeight)
    {
        return suspensionHeight + suspensionAdjustment;
    }

    public double getTyrePressureAdjustment()
    {
        return tyrePressureAdjustment;
    }

    public void setTyrePressureAdjustment(double tyrePressureAdjustment)
    {
        this.tyrePressureAdjustment = tyrePressureAdjustment;
    }

    public int getSuspensionAdjustment()
    {
        return suspensionAdjustment;
    }

    public void setSuspensionAdjustment(int suspensionAdjustment)
    {
        this.suspensionAdjustment = suspensionAdjustment;
    }
}
