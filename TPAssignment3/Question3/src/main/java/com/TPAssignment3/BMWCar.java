package com.TPAssignment3;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class BMWCar implements InterfaceCar
{
    public CarInfo getCarInfo()
    {

        CarInfo BMW = new CarInfo("BMW 318i", 2005, "Blue");
        return BMW;
    }
}
