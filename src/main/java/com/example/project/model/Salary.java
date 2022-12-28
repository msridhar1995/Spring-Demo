package com.example.project.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Salary {
	
	@Id
	private int emp_id;
	private int salary;
	
	
	public Salary()
	{
		super();
	}
	
	public Salary(int emp_id, int salary) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
	}
		
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_id, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Salary other = (Salary) obj;
		return emp_id == other.emp_id && salary == other.salary;
	}

	@Override
	public String toString() {
		return "Salary [emp_id=" + emp_id + ", salary=" + salary + "]";
	}
	
}
