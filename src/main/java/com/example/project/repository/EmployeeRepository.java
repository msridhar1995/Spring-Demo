package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
