package com.componentmapping.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.componentmapping.demo.entities.Address;
import com.componentmapping.demo.entities.Employee;
import com.componentmapping.demo.repository.EmployeeRepo;

@SpringBootTest
class ComponentMappingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	EmployeeRepo repo;
	
	@Test
	public void create() {
		Employee e = new Employee();
		e.setId(123);
		e.setName("ABC");
		Address a = new Address();
		a.setStreetaddress("Krushak");
		a.setCity("Amravati");
		a.setCountry("India");
		a.setState("Maharashtra");
		a.setZipcode("444606");
		e.setAddress(a);
		repo.save(e);
	}

}
