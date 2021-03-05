package com.test.service;

import java.util.List;

import com.test.repository.Employee;


public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeID(Employee emp);

	public boolean addEmployee(Employee emp);
}
