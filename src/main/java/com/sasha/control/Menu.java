package com.sasha.control;

import com.sasha.Airline;
import com.sasha.entity.Aircraft;
import com.sasha.view.Print;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final static List<String> listAvailableAircraftFromFile = new ArrayList();
    private static Airline airlinePermanent;
    private static Airline localAirline;
    private static BufferedReader br;

    static {
        try {
            br = new BufferedReader(new FileReader(new File
                    ("src\\main\\resources\\Aircraft.txt")));
            String line = br.readLine();
            while(line != null){
                listAvailableAircraftFromFile.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void chooseMenuItem(Print print, Airline defaultAirline){
        if(airlinePermanent == null){
            airlinePermanent = defaultAirline;
        }
        int enterValue = -1;
        while(enterValue != 0){
            System.out.println("\nChoose one of the options:\n" +
                "1. Create airline\n" +
                "2. Show aircraft in a default airline\n" +
                "3. Calculate total capacity\n" +
                "4. Calculate carrying capacity\n" +
                "5. Sort the aircrafts by flight range\n" +
                "6. Find aircraft corresponding to the specified range of fuel consumption parameters\n" +
                "0. Exit\n");

            Scanner scanner = new Scanner(System.in);
            try{
                enterValue = scanner.nextInt();
            }
            catch (InputMismatchException inException){
                print.printMistake();
            }
            switch (enterValue) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Airline airlineNew = createAirline(print, scanner);
                    if(airlineNew != null){
                        airlinePermanent = airlineNew;
                    }
                    break;
                case 2:
                    print.printDefaultAirline(airlinePermanent);
                    break;
                case 3:
                    int totalCapacity = airlinePermanent.calculateCapacity();
                    print.printTotalCapacity(totalCapacity);
                    break;
                case 4:
                    int carryingCapacity = airlinePermanent.calculateCarryingCapacity();
                    print.printCarryingCapacity(carryingCapacity);
                    break;
                case 5:
                    List<Aircraft> list = airlinePermanent.sortByFlightRange();
                    System.out.println("Sorted airplanes over the range of flights.");
                    print.printListAircraft(list);
                    break;
                case 6:
                    airlinePermanent.choseAircraftByFuelConsumption(print, scanner);
                    break;
                default:
                    print.printMistake();
            }
        }
    }


    public Airline createAirline(Print print, Scanner scanner) {
        int enterValue = -1;
        while (enterValue != 0) {
            System.out.println("\nChoose one of the options:\n" +
                    "1. Show available aircraft\n" +
                    "2. Give the name of the airline\n" +
                    "3. Add aircraft to airline\n" +
                    "4. Show already added aircrafts\n" +
                    "0. Exit\n");
            try{
                enterValue = scanner.nextInt();
            }catch(java.util.InputMismatchException e){
                print.printMistake2();
                return null;
            }

            switch (enterValue) {
                case 1:
                    print.showAvailableAircrafts(listAvailableAircraftFromFile);
                    break;
                case 2:
                    nameAirline(scanner);
                    break;
                case 3:
                    addAircraft(scanner);
                    break;
                case 4:
                    if(localAirline != null){
                        print.printListAircraft(localAirline.getList());
                        break;
                    }
                    print.printMistake3();
                    break;
                case 0: break;
                default: print.printMistake2();
            }
        }
        return localAirline;
    }

    public void nameAirline(Scanner scanner){
        System.out.println("Enter name of airline");
        String aircraftName = scanner.next();
        if(localAirline == null){
            localAirline = new Airline(aircraftName);
        }else{
            localAirline.setName(aircraftName);
        }

    }

    public void addAircraft(Scanner scanner){
        if(localAirline == null){
            localAirline = new Airline("Emre");
        }
        System.out.println("Enter name of aircraft");
        String aircraftName = scanner.next();
        System.out.println("Enter number of aircraft");
        int number = 0;
        try{
            number = scanner.nextInt();
        }catch(java.util.InputMismatchException e){
            System.out.println("Enter right number of aircraft");
        }
        try {
            Class className = Class.forName("com.sasha.entity." + aircraftName);
            Constructor classConstructor  = className.getConstructor();
            Aircraft aircraft = (Aircraft) classConstructor.newInstance();

            for(int i = 0; i < number; i++){
                localAirline.getList().add(aircraft);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("enter the correct name of the aircraft " +
                    "according to the data from the list\n");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}