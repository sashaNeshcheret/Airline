package com.sasha.entity.Factory;

import com.sasha.entity.Aircraft;

public class AircraftFactory {
    public static Aircraft create(){
        int num = (int)(Math.random()*2);
        switch(num){
            case 0:
                return CargoPlaneFactory.create();
            case 1:
                return PassengerPlaneFactory.create();
            default: return null; // так як діапазон int набагато більше 5
        }
    }
}
