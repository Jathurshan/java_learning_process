package com.kayal.employeejpa.service;

import java.util.List;

import com.kayal.employeejpa.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> fetchAllEmployees();
}