package com.kayal.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayal.employeeservice.model.Employee;
import com.kayal.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/services")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", produces=MediaType.APPLICATION_XML_VALUE)
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
}
