package com.kayal.allocationservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayal.allocationservice.model.Allocation;
import com.kayal.allocationservice.repository.AllocationRepository;

@Service
public class AllocationServiceImpl implements AllocationService {
	
	@Autowired
	AllocationRepository allocationRepository;
	
	@Override
	public Allocation createAllocation(Allocation allocation){
		return allocationRepository.save(allocation);
	}
	
	@Override
	public List<Allocation> fetchAllAllocation() {
		return allocationRepository.findAll();
	}
	
	@Override
	public Optional<Allocation> getAllocationById(Integer id) {
		return allocationRepository.findById(id);
	}
}
