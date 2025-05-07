package com.jpademo.component.mapping.demo.entity;

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
@Table(name="customerdetails")
public class Customer {
	@Id
	@TableGenerator(name = "customer_gen", table = "id_gen", pkColumnName = "gen_name", pkColumnValue="customerdetails", valueColumnName = "gen_val", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "customer_gen")
	private int id;
	private String name;
	private String email;
	@Embedded
	Address address;
}
