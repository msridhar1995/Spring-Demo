package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Employee;
import com.example.project.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	public List<Employee> getAllEmp() 
	{
		return emprepo.findAll();
	}	
	
	public Employee getEmpByid(int emp_id) 
	{
		return emprepo.findById(emp_id).orElse(null);
	}
	
}
