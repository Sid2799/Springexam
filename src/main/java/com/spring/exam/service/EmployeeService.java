package com.spring.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.exam.entity.Employee;
import com.spring.exam.repository.*;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	//to save the employee
	public Employee saveEmployee(Employee e) {
		return repo.save(e);	
	}
	
	//to save the list of employee
	public List<Employee> saveEmployees(List<Employee> s) {
		return repo.saveAll(s);
	}
	
	//to fetch the list of employee
	public List<Employee> getEmployees(){
		return repo.findAll();
		
	}
	
	//to fetch based on id
	public Employee getEmployeebyId(int id){
		return repo.findById(id).orElse(null);
	}
	
	//to get the product by name
//	public Employee getEmployeebyName(String name) {
//		return repo.findbyName(name);
//	}
	
	//to delete the item
	public String deleteEmployee(int id) {
		repo.deleteById(id);;
		return "deleted the data" +id;
	}
	
	//update employee
	public Employee updateEmployee(Employee e) {
		Employee existingEmployee = repo.findById(e.getId()).orElse(null);
		existingEmployee.setFirstName(e.getFirstName());
		existingEmployee.setLastName(e.getLastName());
		return repo.save(existingEmployee);
		
	}
	
	
	
	
	
}
