package com.sasha.view;

import com.sasha.Airline;
import com.sasha.entity.Aircraft;

import java.util.List;

public class Print {
    public void printList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\"" + list.get(i) + "\", ");
            if(i%5 == 0 && i != 0) System.out.println("\n");
        }
    }

    public void printListAircraft(List<Aircraft> list){
        for (Aircraft aList : list) {
            System.out.println(aList);
        }
    }
    public void printDefaultAirline(Airline airline){
        System.out.println(airline.getName());
        printListAircraft(airline.getList());
    }

    public void showAvailableAircrafts(List<String> list){
        if(list.size() != 0) printList(list);
        else System.out.println("Sorry, there are not any aircraft");
    }
    public void printTotalCapacity(int capacity) {
        System.out.println("The total capacity of all passenger aircraft in the airline is - " + capacity + " pass.");
    }
    public void printCarryingCapacity(int capacity) {
        System.out.println("The carrying capacity of all cargo aircraft in the airline is - " + capacity + " kilogram.");
    }
    public void printMistake() {
        System.out.println("Enter correct value. It will be number in diapason(0..6)");
    }
    public void printMistake2() {
        System.out.println("Enter correct value. It will be number in diapason(0..4)");
    }
    public void printMistake3() {
        System.out.println("Sorry, you have not added any planes yet");
    }

}

