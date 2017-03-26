package com.TPAssignment3.Configurations;

import com.TPAssignment3.Cars.BMWCar;
import com.TPAssignment3.Cars.FordCar;
import com.TPAssignment3.Cars.MercedesCar;
import com.TPAssignment3.Cars.ToyotaCar;
import com.TPAssignment3.Interface.InterfaceCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Riyaad on 3/25/2017.
 */
@Configuration
public class Config
{

    @Bean(name="Ford")
    public InterfaceCar getFordCar()
    {
        return new FordCar();
    }

    @Bean(name="BMW")
    public InterfaceCar getBMWCar()
    {
        return new BMWCar();
    }

    @Bean(name="Toy")
    public InterfaceCar getToyotaCar()
    {
        return new ToyotaCar();
    }

    @Bean(name="Merc")
    public InterfaceCar getMercedesCar()
    {
        return new MercedesCar();
    }

}
