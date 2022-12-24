package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Salary;
import com.example.project.repository.SalaryRepository;

@Service
public class SalaryService {
	
	@Autowired
	private SalaryRepository salrepo;
	
	public List<Salary> getAllSal()
	{
		return salrepo.findAll();
	}

	public Salary getMaxSal() {
		return salrepo.findTopByOrderBySalaryDesc();
	
	}
}
