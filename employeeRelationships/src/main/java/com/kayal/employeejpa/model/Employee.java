package com.kayal.employeejpa.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String employeeName;
	private String city;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
	private Address address;

	@OneToMany(mappedBy = "employee")
	private List<Telephone> telephone;
	
	@ManyToMany(mappedBy = "employee")
	private Set<Project> project = new HashSet<>();
	
	public Employee(String name, String city, Address address) {
		this.employeeName = name;
		this.city = city;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getId() {
		return id;
	}

	public String getCity() {
		return city;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + "]";
	}

}
