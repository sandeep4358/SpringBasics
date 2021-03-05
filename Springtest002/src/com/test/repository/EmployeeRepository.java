package com.test.repository;

import java.util.List;

public interface EmployeeRepository {
	
	public List<Employee> getAllEmployee();

	public Employee getEmployeeID(Employee emp);

	public boolean addEmployee(Employee emp);

}
