package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Employee;
import com.example.project.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empser;
	
	@GetMapping(path="/getallemp")
	public List<Employee> getAllEmp()
	{
		return empser.getAllEmp();
	}
	
	@GetMapping(path="/getemp/{id}")
	public Employee getEmpByid(@PathVariable int id)
	{
		return empser.getEmpByid(id);
	}
}
