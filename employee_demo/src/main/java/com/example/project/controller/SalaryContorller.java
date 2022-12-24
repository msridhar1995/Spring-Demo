package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Employee;
import com.example.project.model.Salary;
import com.example.project.service.EmployeeService;
import com.example.project.service.SalaryService;

@RestController
public class SalaryContorller {
	@Autowired
	private SalaryService salser;
	@Autowired
	private EmployeeService empser;
	
	@GetMapping(path="/getmaxsal")
	public Employee getmaxsal()
	{
		return empser.getEmpByid(salser.getMaxSal().getEmp_id());
	}
}
