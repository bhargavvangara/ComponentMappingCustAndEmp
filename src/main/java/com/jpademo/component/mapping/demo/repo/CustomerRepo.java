package com.jpademo.component.mapping.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.jpademo.component.mapping.demo.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
