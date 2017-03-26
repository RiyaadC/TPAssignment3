package com.TPAssignment3.CarDetails;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class CarInfo
{
    private String name;
    private int year;
    private String Color;

    public CarInfo(String name, int year, String color)
    {
        this.name = name;
        this.year = year;
        Color = color;
    }

    public String getName()

    {
        return name;
    }

    public int getYear()

    {
        return year;
    }

    public String getColor()

    {
        return Color;
    }

}
