package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "route")
public class Route {
	public Route() {
		
	}
	private String id;
	private String from;
    private String to;
    private int distance;
    private int duration;
    	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", from=" + from + ", to=" + to + ", distance=" + distance + ", duration=" + duration
				+ "]";
	}

}
