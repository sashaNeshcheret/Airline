package com.sasha;

import com.sasha.control.Menu;
import com.sasha.view.Print;

public class MainClass {
    public static void main( String[] args) {
        Print print = new Print();
        Airline airline = Airline.defaultAirline();
        Menu menu = new Menu();
        menu.chooseMenuItem(print, airline);
    }
}
