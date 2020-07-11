package com.core.java.variables;

public class Light {
	final int lightSpeed;
	final long days;
	private long seconds;
	private long distance;
	
	Light(int lightSpeed, long days, long seconds, long distance){
		this.lightSpeed = lightSpeed;
		this.days = days;
		this.seconds = seconds;
		this.distance = distance;
	}
	
	Light(int lightSpeed, long days, long seconds){
		this.lightSpeed = lightSpeed;
		this.days = days;
		this.seconds = seconds;
	}
	
	Light(int lightSpeed, long days){
		this.lightSpeed = lightSpeed;
		this.days = days;
	}

	public int getLightSpeed() {
		return lightSpeed;
	}


	public long getDays() {
		return days;
	}


	public long getSeconds() {
		return seconds;
	}


	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}


	public long getDistance() {
		return distance;
	}


	public void setDistance(long distance) {
		this.distance = distance;
	}
	
	public long calDistance() {
		long value = getLightSpeed() * getSeconds();
		this.setDistance(value);
		return this.getDistance();
	}

}
