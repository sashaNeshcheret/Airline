package com.sasha.entity.Factory;

import com.sasha.entity.CargoPlane;
import com.sasha.entity.*;

public class CargoPlaneFactory {
    public static CargoPlane create(){
        int num = (int)(Math.random()*5);
        switch(num){
            case 0: return new Boeing747_400F
                        ("Boeing747 400F",112630, 8230, 13500, 900, 10700);
            case 1: return new Ilyushin_76
                        ( "Ilyushin 76",60000, 4200, 8262, 850, 10200);
            case 2: return new Аntonov124
                    ("Аntonov 124",120000, 4800, 12600, 800, 11600);
            case 3: return new Аntonov225
                    ("Аntonov 225",250000, 15400, 15900, 850, 11800);
            case 4: return new McDonnellDouglas_11F
                    ("McDonnell Douglas 11F",72630, 4400, 7500, 876, 12600);

        }
        return null;
    }
}
