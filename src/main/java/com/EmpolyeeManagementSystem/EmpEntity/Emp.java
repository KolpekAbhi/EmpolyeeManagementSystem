package com.EmpolyeeManagementSystem.EmpEntity;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Emp {
 
	
	private int id;
	private String firstname;
	private String lastname;
	private String street;
	private String address;
	private String state;
	private String city;
	private String email;
	private String phonenumber;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", street=" + street
				+ ", address=" + address + ", state=" + state + ", city=" + city + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	
}
