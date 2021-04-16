package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.ds.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
