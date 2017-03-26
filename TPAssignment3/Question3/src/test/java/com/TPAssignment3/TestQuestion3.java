package com.TPAssignment3;


import com.TPAssignment3.CarDetails.CarInfo;
import com.TPAssignment3.Configurations.Config;
import com.TPAssignment3.Interface.InterfaceCar;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by Riyaad on 3/25/2017.
 */
public class TestQuestion3 extends TestCase
{
    private InterfaceCar InterCar;
    private InterfaceCar FordCar;


    @BeforeMethod
    public void setUp() throws Exception
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        InterCar=(InterfaceCar)con.getBean("BMW");

        ApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
        FordCar=(InterfaceCar)cxt.getBean("Ford");
    }

    @Test
    public void testBMWyear() throws Exception
    {
        CarInfo info = InterCar.getCarInfo();
        assertEquals("Testing car year failed",info.getYear(),2005);
    }

    @Test
    public void testBMWcolor() throws Exception
    {
        CarInfo info = InterCar.getCarInfo();
        assertEquals("Testing car color failed",info.getColor(),"Blue");
    }

    @Test
    public void testBMWname() throws Exception {
        CarInfo info = InterCar.getCarInfo();
        assertEquals("Testing car name failed", info.getName(), "BMW 318i");
    }


    @Test
    public void testFordname() throws Exception
    {
        CarInfo info = FordCar.getCarInfo();
        assertEquals("Testing car name failed",info.getName(),"Ford Kuga");
    }

    @Test
    public void testFordcolor() throws Exception
    {
        CarInfo info = FordCar.getCarInfo();
        assertEquals("Testing car color failed",info.getColor(),"White");
    }

    @Test
    public void testFordyear() throws Exception
    {
        CarInfo info = FordCar.getCarInfo();
        assertEquals("Testing car year failed",info.getYear(),2006);
    }
    }
