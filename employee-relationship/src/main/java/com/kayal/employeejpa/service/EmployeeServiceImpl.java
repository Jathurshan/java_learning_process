package com.kayal.employeejpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayal.employeejpa.model.Employee;
import com.kayal.employeejpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return  employeeRepository.findAll();
	}
}
