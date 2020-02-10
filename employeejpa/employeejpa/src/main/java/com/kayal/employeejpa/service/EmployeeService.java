package com.kayal.employeejpa.service;

import org.springframework.stereotype.Service;

import com.kayal.employeejpa.model.Employee;

@Service
public interface EmployeeService {
	public Employee createEmployee(Employee employee);
}
