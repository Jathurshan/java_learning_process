package com.krishantha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<>();

		Employee employee = new Employee();
		employee.setEmployeeName("Tony Stark");
		employee.setEmployeeLocation("USA");

		employees.add(employee);

		return employees;
	}
}
