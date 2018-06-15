package com.vasu.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vasu.inventory.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long>{

	List<Vehicle> findByType(String type);
	List<Vehicle> findByColor(String color);
	public List<Vehicle> findTop1ByOrderByIdDesc();
}
