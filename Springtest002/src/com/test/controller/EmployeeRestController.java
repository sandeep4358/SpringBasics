package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.repository.Employee;
import com.test.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value= "/getAllEmployeeJSON")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	
}
