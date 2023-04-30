package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicleRegistration")
public class VehicleRegistration {
	public VehicleRegistration() {
		
	}
	private String id;
    private String number;
    private String expiry;
    private String state;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "VehicleRegistration [id=" + id + ", number=" + number + ", expiry=" + expiry + ", state=" + state + "]";
	}
	
	
	
}