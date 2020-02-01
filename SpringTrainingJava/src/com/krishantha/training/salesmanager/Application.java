package com.krishantha.training.salesmanager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.krishantha.training.salesmanager.config.ApplicationConfiguration;
import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;

public class Application {

	public static void main(String[] args) {
//		EmployeeService employeeService = new EmployeeServiceImpl();
//
//		List<Employee> employees = employeeService.getAllEmployees();
//
//		for (Employee employee : employees) {
//			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
//		}

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.toString());
		
		EmployeeService employeeService2 = applicationContext.getBean("employeeService",EmployeeService.class);
		
		System.out.println(employeeService2.toString());
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}
		
	}
}
