package com.vasu.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vasu.inventory.dao.VehicleRepository;
import com.vasu.inventory.model.Vehicle;

@SpringBootApplication
public class VehicleInventorySystemApplication  implements CommandLineRunner {

	@Autowired
	VehicleRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(VehicleInventorySystemApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

	/*	System.out.println("Vehicle id 10001 -> {}"+ repository.findById(10001L));

		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Jeep", "Blue", "JEP1234")));

		System.out.println("Update 10003 -> {} "+repository.save(new Vehicle(10001L, "Bike", "Black","NEWREGISTRATION")));

//		repository.deleteById(10002L);
*/
		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Car", "Blue", "CR1234")));
		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Truck", "Black", "TR1234")));
		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Airplane", "White", "ARP1234")));
		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Drone", "Blue", "DR1234")));
		System.out.println("Inserting -> {} " + repository.save(new Vehicle("Boat", "Black", "BT1234")));
		System.out.println("All users -> {} :: " +repository.findAll());
	}
}
