package com.jpademo.component.mapping.demo.entity;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Data;

@Entity
@Data
@Table(name="employeedetails")
public class Employee {
	@Id
	@TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", pkColumnValue="employeedetails", valueColumnName = "gen_val", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	private int id;
	private String name;
	@Column(name="emp_email")
	private String email;
	@Embedded
	@AttributeOverride(name = "street", column = @Column(name = "emp_street"))
	@AttributeOverride(name = "city", column = @Column(name = "emp_city"))
	@AttributeOverride(name = "zipcode", column = @Column(name = "emp_zipcode"))
	Address address;
}
