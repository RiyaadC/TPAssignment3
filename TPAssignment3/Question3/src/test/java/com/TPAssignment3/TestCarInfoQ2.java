package com.TPAssignment3;

import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestCarInfoQ2 extends TestCase
{
    CarInfo info = new BMWCar().getCarInfo();
    CarInfo fordinfo = new FordCar().getCarInfo();
    CarInfo MercInfo = new MercedesCar().getCarInfo();
    CarInfo ToyInfo = new ToyotaCar().getCarInfo();

    public void testBMWyear() throws Exception
    {

        assertEquals("Tseting car year failed",info.getYear(),2007);
    }

    public void testBMWcolor() throws Exception
    {
        CarInfo info = new BMWCar().getCarInfo();
        assertEquals("Tseting car year failed",info.getColor(),"Red");
    }

    public void testBMWname() throws Exception
    {
        CarInfo info = new BMWCar().getCarInfo();
        assertEquals("Tseting car year failed",info.getName(),"BMW M4");
    }



}
