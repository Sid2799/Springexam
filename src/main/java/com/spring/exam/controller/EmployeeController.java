package com.spring.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.exam.entity.Employee;
import com.spring.exam.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		return es.saveEmployee(e);
	}

//	@PostMapping("/employees/all")
//	public List<Employee> addEmployees(@RequestBody List<Employee> s) {
//		return es.saveEmployees(s);
//	}

	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		return es.getEmployees();
	}

	@GetMapping("/employees/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return es.getEmployeebyId(id);
	}

//	@GetMapping("/employees/{name}")
//	public Employee findEmployeeByName(@PathVariable String name) {
//		return es.getEmployeebyName(name);
//	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee e) {
		return es.saveEmployee(e);
	}

	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(int id) {
		return es.deleteEmployee(id);
	}

}