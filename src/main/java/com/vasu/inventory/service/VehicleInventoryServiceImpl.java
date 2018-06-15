package com.vasu.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.vasu.inventory.dao.VehicleRepository;
import com.vasu.inventory.model.Vehicle;

@Service("vehicleInventoryService")
public class VehicleInventoryServiceImpl implements VehicleInventoryService {

	@Autowired
	VehicleRepository repository;

	@Autowired
	private Environment environment;

	List<Vehicle> items = new ArrayList<Vehicle>();

	@Override
	public List<Vehicle> findVehicleByType(String type) {

		repository.findByType(type).forEach(vehi -> {
			System.out.println(vehi.toString());
		});
		return repository.findByType(type);
	}

	@Override
	public List<Vehicle> findVehicleByColor(String color) {
		repository.findByColor(color).forEach(vehi -> {
			System.out.println(vehi.toString());
		});
		return repository.findByColor(color);
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		Vehicle veh = repository.save(vehicle);
		return veh;
	}

	@Override
	public Vehicle deleteLastRecord() {
		List<Vehicle> list = repository.findTop1ByOrderByIdDesc();
		Vehicle lastRecord = null;
		if (list != null && list.size() > 0) {
			lastRecord = list.get(0);
			repository.delete(lastRecord);
		}

		return lastRecord;
	}

}
