package com.componentmapping.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.componentmapping.demo.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
