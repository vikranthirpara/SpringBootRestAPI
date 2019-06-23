package com.restapi.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.webapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
