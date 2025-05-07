package com.jpademo.component.mapping.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.component.mapping.demo.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
