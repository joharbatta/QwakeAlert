package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeinmilli;
    private String url;

    public Earthquake(double magnitude,String location,long timeinmilli,String url)
    {
        this.magnitude=magnitude;
        this.location=location;
        this.timeinmilli=timeinmilli;
        this.url=url;

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
    public String getUrl() {
        return url;
    }
}
