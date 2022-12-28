package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project.model.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Integer> {
	
	@Query(value = "SELECT s FROM Salary s where s.emp_id=1")
	Salary findMaxSal();
	Salary findTopByOrderBySalaryDesc();
}
