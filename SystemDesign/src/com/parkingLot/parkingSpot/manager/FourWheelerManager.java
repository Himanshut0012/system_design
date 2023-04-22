package com.parkingLot.parkingSpot.manager;

import java.util.ArrayList;
import java.util.List;

import com.parkingLot.parkingSpot.ParkingSpot;

public class FourWheelerManager extends ParkingSpotManager{

	private static List<ParkingSpot> list= new ArrayList<ParkingSpot>(400);

	public FourWheelerManager() {
		super(list);
		// TODO Auto-generated constructor stub
	}

}
