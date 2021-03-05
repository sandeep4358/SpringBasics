package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.repository.Employee;
import com.test.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployee() {
		return repository.getAllEmployee();		
	}

	@Override
	public Employee getEmployeeID(Employee emp) {
		// TODO Auto-generated method stub
		return repository.getEmployeeID(emp);
	}

	@Override
	public boolean addEmployee(Employee emp) {		
		return repository.addEmployee(emp);		
	}

}
