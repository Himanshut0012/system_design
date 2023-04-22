package com.parkingLot.parkingSpot;

import com.parkingLot.vehicle.Vehicle;


public class ParkingSpot {

	public int id;
	public boolean isEmpty;
	public Vehicle vehicle;
	public int price;
	
	public void parkVehicle(Vehicle vehicle) {
		this.vehicle=vehicle;
		this.isEmpty=false;
	}
	
	public void removedVehicle() {
		this.vehicle=null;
		this.isEmpty=true;
	}
}
