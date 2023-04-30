package com.example.demo.models;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "busOperators")
public class BusOperator {
	public BusOperator() {

	}
    @Id
    private String id;
    private String vehicleClass;
    private boolean ac;
    private int fare;
    private int capacity;
    private List<String> features;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<String> getFeatures() {
		return features;
	}
	public void setFeatures(List<String> features) {
		this.features = features;
	}
	
	@Override
	public String toString() {
		return "BusOperator [id=" + id + ", vehicleClass=" + vehicleClass + ", ac=" + ac + ", fare=" + fare
				+ ", capacity=" + capacity + ", features=" + features + "]";
	}
}