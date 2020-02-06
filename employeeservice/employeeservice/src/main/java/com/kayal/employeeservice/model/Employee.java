package com.kayal.employeeservice.model;

public class Employee {
	private String employeeName;
	private int employeeId;

	public Employee(String name, int id) {
		this.employeeName = name;
		this.employeeId = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
	}

}
