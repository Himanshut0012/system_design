package com.parkingLot.vehicle;

public class Vehicle {

	private String vehicleNomuber;
	private VehicleType vehicleType;
	public String getVehicleNomuber() {
		return vehicleNomuber;
	}
	public void setVehicleNomuber(String vehicleNomuber) {
		this.vehicleNomuber = vehicleNomuber;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Vehicle(String vehicleNomuber, VehicleType vehicleType) {
		super();
		this.vehicleNomuber = vehicleNomuber;
		this.vehicleType = vehicleType;
	}
	
	
}
