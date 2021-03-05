package com.test.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	List<Employee> empList = new ArrayList<Employee>();

	public EmployeeRepositoryImpl() {
		Employee emp0 = new Employee(1, "Ranjan", "Parashar", "ranjan.raju@gmail.com", "999999999");
		Employee emp1 = new Employee(1, "Amit", "Sharma", "ranjan.raju@gmail.com", "8132548454");
		Employee emp2 = new Employee(1, "Ramesh", "Raju", "ranjan.raju@gmail.com", "959595959");
		Employee emp3 = new Employee(1, "Sanju", "Kumar", "ranjan.raju@gmail.com", "6656565656");
		Employee emp4 = new Employee(1, "Pankaj", "Talpare", "ranjan.raju@gmail.com", "2554165412");
		Employee emp5 = new Employee(1, "Retu", "Rajadhan", "ranjan.raju@gmail.com", "8542154562");
		Employee emp6 = new Employee(1, "Neetu", "Sakiya", "ranjan.raju@gmail.com", "6665215424");
		empList.add(emp0);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
	}

	/**
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployee() {
		return empList;
	}

	/**
	 * 
	 * @param emp
	 * @return
	 */
	public Employee getEmployeeID(Employee emp) {
		for (Employee employee : empList) {
			if (employee.getEmployeeID() == emp.getEmployeeID()) {
				return employee;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param emp
	 */
	public boolean addEmployee(Employee emp) {
		return empList.add(emp);
	}
}
