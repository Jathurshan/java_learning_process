package com.kayal.allocationservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kayal.allocationservice.model.Allocation;
import com.kayal.allocationservice.service.AllocationService;

@RestController
public class AllocationController {

	@Autowired
	AllocationService allocationService;

	@RequestMapping(value = "/allocation", method = RequestMethod.POST)
	public Allocation createAllocation(@RequestBody Allocation allocation) {
		return allocationService.createAllocation(allocation);
	}

	@RequestMapping(value = "/allocation/{id}", method = RequestMethod.GET)
	public Optional<Allocation> fetchAllocationsById(@PathVariable(value = "id") Integer id) {
		return allocationService.getAllocationById(id);
	}

	@RequestMapping(value = "/allocation", method = RequestMethod.GET)
	public List<Allocation> fetchAllAllocation() {
		return allocationService.fetchAllAllocation();
	}
}
