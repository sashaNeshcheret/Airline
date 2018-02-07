package com.sasha.entity.Factory;

import com.sasha.entity.PassengerPlane;
import com.sasha.entity.*;

public class PassengerPlaneFactory {
    public static PassengerPlane create(){
        int num = (int)(Math.random()*9);
        switch(num){
            case 0: return new Boeing_757_200
                    ("Boeing 757 200",224, 5550, 4200, 850, 12800);
            case 1: return new Boeing_737_500
                    ("Boeing 737 500",132, 3400, 3000, 795, 12400);
            case 2: return new Boeing_767_300
                    ("Boeing 767 300",328, 4500, 4500, 850, 13100);
            case 3: return new Boeing_727_200
                    ("Boeing 727 200",198, 4020, 5018, 965, 12192);
            case 4: return new McDonnellDouglas_83
                    ("McDonnell Douglas 83",172, 4600, 3400, 811, 12300);
            case 5: return new Fokker_50
                    ("Fokker 50",58, 1120, 800, 550, 7620);
            case 6: return new Airbus310
                    ("Airbus 310",270, 9170, 5008, 860, 11500);
            case 7: return new Airbus320
                    ("Airbus320",170, 6150 , 220, 860, 10300);
            case 8: return new Boeing_747_400
                    ("Boeing 747 400",168, 13430, 5000, 830, 13750);
            default: return null;
        }
    }
}
