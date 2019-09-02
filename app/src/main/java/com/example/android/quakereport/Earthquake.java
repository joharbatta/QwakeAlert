package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeinmilli;

    public Earthquake(double magnitude,String location,long timeinmilli)
    {
        this.magnitude=magnitude;
        this.location=location;
        this.timeinmilli=timeinmilli;

    }
    public double getMagnitude()
    {
        return  magnitude;
    }

    public long getDate() {
        return timeinmilli;
    }

    public String getLocation() {
        return location;
    }
}
