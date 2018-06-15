package com.vasu.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	String type;
	String color;
	String registrationNumber;
	
	public Vehicle() {}
	
	public Vehicle(Long id, String type, String color, String registrationNo) {
		this.id = id;
		this.type = type;
		this.color = color;
		this.registrationNumber = registrationNo;
	}
	public Vehicle(String type, String color, String registrationNo) {
		
		this.type = type;
		this.color = color;
		this.registrationNumber = registrationNo;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+", type: "+type+", color "+color+", registration "+registrationNumber;
	}
}
