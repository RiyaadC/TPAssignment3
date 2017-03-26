package com.TPAssignment3;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class MercedesCar implements InterfaceCar
{

    public CarInfo getCarInfo()
    {

        CarInfo merc = new CarInfo("Mercedes SLK", 2010, "Black");
        return merc;
    }
}
