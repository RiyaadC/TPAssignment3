package com.TPAssignment3;

import com.TPAssignment3.CarDetails.CarInfo;
import com.TPAssignment3.Cars.BMWCar;
import com.TPAssignment3.Cars.FordCar;
import com.TPAssignment3.Cars.MercedesCar;
import com.TPAssignment3.Cars.ToyotaCar;
import junit.framework.TestCase;
import org.testng.annotations.Test;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestCarInfoQ2 extends TestCase
{
    CarInfo info = new BMWCar().getCarInfo();
    CarInfo fordinfo = new FordCar().getCarInfo();
    CarInfo MercInfo = new MercedesCar().getCarInfo();
    CarInfo ToyInfo = new ToyotaCar().getCarInfo();

    @Test
    public void testBMWyear() throws Exception
    {

        assertEquals("Tseting car year failed",info.getYear(),2005);
    }

    @Test
    public void testBMWcolor() throws Exception
    {
        CarInfo info = new BMWCar().getCarInfo();
        assertEquals("Tseting car year failed",info.getColor(),"Blue");
    }

    @Test
    public void testBMWname() throws Exception
    {
        CarInfo info = new BMWCar().getCarInfo();
        assertEquals("Testing car year failed",info.getName(),"BMW 318i");
    }

    @Test
    public void testFordyear() throws Exception
    {

        assertEquals("Tseting car year failed",fordinfo.getYear(),2006);
    }

    @Test
    public void testFordcolor() throws Exception
    {

        assertEquals("Tseting car year failed",fordinfo.getColor(),"White");
    }

    @Test
    public void testFordname() throws Exception
    {

        assertEquals("Testing car year failed",fordinfo.getName(),"Ford Kuga");
    }

    @Test
    public void testMercyear() throws Exception
    {

        assertEquals("Tseting car year failed",MercInfo.getYear(),2010);
    }

    @Test
    public void testMerccolor() throws Exception
    {

        assertEquals("Tseting car year failed",MercInfo.getColor(),"Black");
    }

    @Test
    public void testMercname() throws Exception
    {

        assertEquals("Testing car year failed",MercInfo.getName(),"Mercedes SLK");
    }

    @Test
    public void testToyyear() throws Exception
    {

        assertEquals("Tseting car year failed",ToyInfo.getYear(),2002);
    }

    @Test
    public void testToyccolor() throws Exception
    {

        assertEquals("Tseting car year failed",ToyInfo.getColor(),"Red");
    }

    @Test
    public void testToycname() throws Exception
    {

        assertEquals("Testing car year failed",ToyInfo.getName(),"Toyota Supra");
    }
}
