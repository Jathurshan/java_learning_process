package com.kayal.employeejpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayal.employeejpa.model.Employee;
import com.kayal.employeejpa.service.EmployeeService;

@RestController
@RequestMapping("/services")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public Employee storeEmploye(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
}
