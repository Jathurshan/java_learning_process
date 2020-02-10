package com.kayal.employeejpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String employeeName;
	
	public Employee(String name, int id) {
		this.employeeName = name;
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + "]";
	}

}
