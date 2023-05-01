package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stops")
public class Stops {	
	public Stops() {

	}
	@Id
	private String id;
	private String name;
    private int distanceFromOrigin;
    private String timeFromOrigin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistanceFromOrigin() {
		return distanceFromOrigin;
	}
	public void setDistanceFromOrigin(int distanceFromOrigin) {
		this.distanceFromOrigin = distanceFromOrigin;
	}
	public String getTimeFromOrigin() {
		return timeFromOrigin;
	}
	public void setTimeFromOrigin(String timeFromOrigin) {
		this.timeFromOrigin = timeFromOrigin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Stops [id=" + id + ", name=" + name + ", distanceFromOrigin=" + distanceFromOrigin + ", timeFromOrigin="
				+ timeFromOrigin + "]";
	}
	
	
	
}
