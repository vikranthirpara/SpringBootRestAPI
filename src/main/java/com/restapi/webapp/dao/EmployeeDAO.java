package com.restapi.webapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.webapp.model.Employee;
import com.restapi.webapp.repository.EmployeeRepository;

//Using the model class and repository we insert the data into db using DAO

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;

	// to save an employee
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}

	// search all employees
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	// update an employee or get an employee
	public Employee findOne(Long empid) {
		return employeeRepository.findById(empid).orElse(null);
	}

	// delete an employee

	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}

}
