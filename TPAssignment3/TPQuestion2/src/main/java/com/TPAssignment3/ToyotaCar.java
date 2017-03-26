package com.TPAssignment3;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class ToyotaCar implements InterfaceCar {
    public CarInfo getCarInfo()
    {
        CarInfo Toy = new CarInfo("Toyota Supra", 2002, "Red");
        return Toy;
    }
}
