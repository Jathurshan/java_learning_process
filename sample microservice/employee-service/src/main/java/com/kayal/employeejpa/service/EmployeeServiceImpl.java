package com.kayal.employeejpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.kayal.employeejpa.model.Employee;
import com.kayal.employeejpa.repository.EmployeeRepository;
import com.kayal.employeejpa.sharedmodel.Allocation;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Allocation[] fetchAllocation(Employee employee) {
		// TODO Auto-generated method stub
		HttpHeaders httpHeaders = new HttpHeaders();
		HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
		ResponseEntity<Allocation[]> allocationResponse = restTemplate.exchange(
				"http://localhost:8081/allocation/" + employee.getId(), HttpMethod.GET, httpEntity, Allocation[].class);

		if (allocationResponse.getStatusCode().value() == 200) {
			return allocationResponse.getBody();
		}
		return new Allocation[0];
	}

	@Override
	public Employee find(Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> employee1 = employeeRepository.findById(employee.getId());

		if (employee1.isPresent()) {
			Allocation[] allocations = fetchAllocation(employee);
			Employee emp = employee1.get();
			emp.setAllocation(allocations);
			return emp;
		}
		return null;
	}
}
