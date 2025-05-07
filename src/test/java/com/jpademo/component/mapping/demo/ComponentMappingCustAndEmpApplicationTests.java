package com.jpademo.component.mapping.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpademo.component.mapping.demo.entity.Address;
import com.jpademo.component.mapping.demo.entity.Customer;
import com.jpademo.component.mapping.demo.entity.Employee;
import com.jpademo.component.mapping.demo.repo.CustomerRepo;
import com.jpademo.component.mapping.demo.repo.EmployeeRepo;

@SpringBootTest
class ComponentMappingCustAndEmpApplicationTests {
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private EmployeeRepo employeeRepo;
	@Test
	void saveEmployeeDetails() {
		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setEmail("john@gml.com");
		employee.setAddress(new Address("123 Main St", "New York", "10001"));
		employeeRepo.save(employee);
		
	}
	
	@Test
	void saveCustomerDetails()
	{
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		customer.setEmail("jane@gml.com");
		customer.setAddress(new Address("456 Elm St", "Los Angeles", "90001"));
		customerRepo.save(customer);
	}
}
