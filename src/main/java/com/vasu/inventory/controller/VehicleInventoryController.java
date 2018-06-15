package com.vasu.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vasu.inventory.model.Vehicle;
import com.vasu.inventory.service.VehicleInventoryService;


@RestController
public class VehicleInventoryController {

	private ResourceLoader resourceLoader = new DefaultResourceLoader();
	
	@Autowired
	VehicleInventoryService inventoryService;
	

	@RequestMapping(value = "/getvehiclebytype/{type}", method = RequestMethod.GET, produces = "application/json")
	public List<Vehicle> findVehicleByType(@PathVariable("type") String type) {
		
		return inventoryService.findVehicleByType(type);
	}

	@RequestMapping(value = "/getvehiclebycolor/{color}", method = RequestMethod.GET, produces = "application/json")
	public List<Vehicle> findVehicleByColor(@PathVariable("color") String color) {

		return inventoryService.findVehicleByColor(color);
	}

	@RequestMapping(value = "/savevehicle", method = RequestMethod.POST, produces = "application/json")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {

		return inventoryService.addVehicle(vehicle);
	}

	@RequestMapping(value = "/deletelastrecord", method = RequestMethod.DELETE, produces = "application/json")
	public Vehicle deleteLastRecord() {

		 return inventoryService.deleteLastRecord();
	}

}
