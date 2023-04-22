package com.parkingLot.parkingSpot.manager;

import java.util.ArrayList;
import java.util.List;

import com.parkingLot.parkingSpot.ParkingSpot;

public class TwoWheelerManager extends ParkingSpotManager {
	private static List<ParkingSpot> list = new ArrayList<ParkingSpot>(600);

	public TwoWheelerManager() {
		super(list);
	}

}
