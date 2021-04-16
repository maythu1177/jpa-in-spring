package com.sp.tech.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sp.tech.ds.Employee;
import com.sp.tech.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Transactional
	public void saveEmployee() {
		Employee e = new Employee(1, "may", "zin", "zin@gmail.com", 300000, Date.valueOf("2021-01-01"));
		employeeRepo.save(e);
	}
	
	@Transactional
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

}
