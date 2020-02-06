package com.kayal.employeeservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kayal.employeeservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("james", 80));
		list.add(new Employee("liyano", 95));
		list.add(new Employee("mitchel", 75));

		return list;
	}
}
