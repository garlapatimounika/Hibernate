package com.entity;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
	private String department;
	private int salary;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + "]";
	}
	public Employee(String department, int salary) {
		super();
		this.department = department;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
