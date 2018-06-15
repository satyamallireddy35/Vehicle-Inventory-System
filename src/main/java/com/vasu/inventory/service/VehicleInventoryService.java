package com.vasu.inventory.service;

import java.util.List;

import com.vasu.inventory.model.Vehicle;

public interface VehicleInventoryService {
	public List<Vehicle> findVehicleByType(String type);

	public List<Vehicle> findVehicleByColor(String color);
	
	public Vehicle addVehicle(Vehicle vehicle);
	
	public Vehicle deleteLastRecord();
}
