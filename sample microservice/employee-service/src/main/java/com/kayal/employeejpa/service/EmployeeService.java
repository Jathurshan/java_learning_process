package com.kayal.employeejpa.service;

import java.util.List;

import com.kayal.employeejpa.model.Employee;
import com.kayal.employeejpa.sharedmodel.Allocation;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> fetchAllEmployees();
	
	public Allocation[] fetchAllocation(Employee employee);
	
	public Employee find(Employee employee);
}