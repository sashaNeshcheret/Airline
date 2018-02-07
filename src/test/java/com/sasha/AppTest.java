package com.sasha;

import com.sasha.entity.Aircraft;
import com.sasha.entity.Boeing_737_500;
import com.sasha.entity.Boeing_757_200;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class AppTest{
    private Airline airline = new Airline("Test");
    private Aircraft aircraft1;
    private Aircraft aircraft2;

    @Before
    public void init(){
        aircraft1 = new Boeing_737_500();
        aircraft2 = new Boeing_757_200();
        aircraft1.setCapacity(300);
        aircraft1.setFlightRange(3000);
        aircraft1.setFuelConsumption(140);
        aircraft2.setCapacity(400);
        aircraft2.setFlightRange(1000);
        aircraft2.setFuelConsumption(200);
        airline.getList().add(aircraft1);
        airline.getList().add(aircraft2);
    }

    @After
    public void destroy(){
        aircraft1 = null;
        aircraft2 = null;
        airline = null;
    }

    @Test
    public void calculateCapacityTest(){
        int actual = 700;
        int expected = airline.calculateCapacity();
        Assert.assertEquals("Total capacity is not true", expected, actual);

    }

    @Test
    public void sortByFlightRangeTest(){
        Aircraft actual = aircraft2;
        List<Aircraft> sortList = airline.sortByFlightRange();
        Aircraft expected = sortList.get(0);
        Assert.assertEquals("Wrong sort", expected, actual);

    }
    @Test
    public void findByFuelConsumptionTest(){
        Aircraft actual = aircraft1;
        List<Aircraft> sortList = airline.findByFuelConsumption(130, 150);
        Aircraft expected = sortList.get(0);
        Assert.assertEquals("Wrong find by fuel consumption", expected, actual);

    }

}
