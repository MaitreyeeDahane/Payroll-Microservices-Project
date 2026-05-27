package com.example.employee.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {

	    if(id == 1) {
	        return new Employee(1, "Maitreyee", 30000);
	    }
	    else if(id == 2) {
	        return new Employee(2, "Rahul", 40000);
	    }
	    else {
	        return new Employee(id, "Unknown Employee", 20000);
	    }
	}
}