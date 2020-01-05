package com.app.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeRequest {
	
	private String firstName;
	private String lastName;
	private String middleName;
 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private LocalDateTime dob;
	private String country;
	private String state;
	private String city;
	private long zipCode;
	private String gender;
	//private String company = "NA";
	private String contacts;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * public String getCompany() { return company; } public void setCompany(String
	 * company) { this.company = company; }
	 */
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public EmployeeRequest() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeRequest [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", dob=" + dob + ", country=" + country + ", state=" + state + ", city=" + city + ", zipCode="
				+ zipCode + ", gender=" + gender + ", contacts=" + contacts + "]";
	}

}
