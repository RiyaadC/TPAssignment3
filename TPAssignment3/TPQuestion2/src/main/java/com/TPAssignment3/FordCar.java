package com.TPAssignment3;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class FordCar implements InterfaceCar
{
    public CarInfo getCarInfo()
    {

        CarInfo Ford = new CarInfo("Ford Kuga", 2006, "White");
        return Ford;
    }
}
