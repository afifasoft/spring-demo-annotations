package com.alakesoftware.springdemoannotations.model;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United State of America");
		
	}
	

	public Student(String firstName, String lastName, String country) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
