package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "driver")
public class Driver {
    public Driver() {
		
	}
    private String id;
	private String name;
    private String licenseNumber;
    private String contactNumber;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", licenseNumber=" + licenseNumber + ", contactNumber="
				+ contactNumber + "]";
	}
	
}