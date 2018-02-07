package com.sasha.control;

import com.sasha.entity.Aircraft;
import java.util.Comparator;

public class FlightRangeComparator implements Comparator<Aircraft> {

	public int compare(Aircraft aircraft1, Aircraft aircraft2) {
        return Double.compare(aircraft1.getFlightRange(), aircraft2.getFlightRange());
    }
}