package com.sasha;

import com.sasha.control.FlightRangeComparator;
import com.sasha.entity.*;
import com.sasha.entity.Factory.CargoPlaneFactory;
import com.sasha.entity.Factory.PassengerPlaneFactory;
import com.sasha.view.Print;

import java.math.BigDecimal;
import java.util.*;

public class Airline {
    private String name;
    private List<Aircraft> list = new ArrayList();

    public Airline(String name) {
        this.name = name;
    }

    public List<Aircraft> getList() {
        return list;
    }
    public void setList(List<Aircraft> list) {
        this.list = list;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int calculateCapacity(){
        int result = 0;
        for(Aircraft aircraft : list){
            if(aircraft instanceof PassengerPlane){
                result += aircraft.getCapacity();
            }
        }
        return result;
    }
    public int calculateCarryingCapacity(){
        int result = 0;
        for(Aircraft aircraft : list){
            if(aircraft instanceof CargoPlane){
                result += aircraft.getCapacity();
            }
        }
        return result;
    }

    public List<Aircraft> sortByFlightRange(){
        Collections.sort(list,new FlightRangeComparator());
        return list;
    }
    public List<Aircraft> findByFuelConsumption(int bottom, int top){
        List<Aircraft> listAircraft = new ArrayList();
        for(Aircraft aircraft : list){
            if(aircraft.getFuelConsumption() >= bottom &&
               aircraft.getFuelConsumption() <= top){
                listAircraft.add(aircraft);
            }
        }
        return listAircraft;
    }
    public void choseAircraftByFuelConsumption(Print print, Scanner scanner) {
        int lowerRange, upperRange;

        System.out.println("Enter the lower limit:");
        try {
            lowerRange = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();
            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperRange = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input! ");
            scanner.next();
            return;
        }if(lowerRange >= upperRange){
            System.out.println("Upper limit must be greater than the lower limit");
            return;
        }
        System.out.println("Aircraft corresponding to a given range of fuel consumption parameters from " +
                lowerRange + " to "+ upperRange+"(liters per hour):");
        print.printListAircraft(this.findByFuelConsumption(lowerRange, upperRange));
    }
    public static Airline defaultAirline(){
        Airline airline = new Airline("Ukraine International Airlines");
        airline.getList().add(PassengerPlaneFactory.create());
        airline.getList().add(PassengerPlaneFactory.create());
        airline.getList().add(PassengerPlaneFactory.create());
        airline.getList().add(PassengerPlaneFactory.create());
        airline.getList().add(PassengerPlaneFactory.create());
        airline.getList().add(CargoPlaneFactory.create());
        airline.getList().add(CargoPlaneFactory.create());
        return airline;
    }

}
