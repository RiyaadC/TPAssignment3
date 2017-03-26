package com.TPAssignment3.Cars;

import com.TPAssignment3.CarDetails.CarInfo;
import com.TPAssignment3.Interface.InterfaceCar;

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
