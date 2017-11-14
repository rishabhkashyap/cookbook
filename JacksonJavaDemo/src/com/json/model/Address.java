package com.json.model;

public class Address {
	private String addLine1;
	private String city;
	private String state;
	private String pin;
	
	public Address(String addLine1, String city, String state, String pin) {
		super();
		this.addLine1 = addLine1;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public Address(){}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	

}
