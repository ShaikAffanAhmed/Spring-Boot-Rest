package com.app.affan.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.affan.entity.Address;
import com.app.affan.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@GetMapping("/find")
	public ResponseEntity<Employee> getOneEmployee()
	{
		Employee employee = new Employee(101, "AA",500.45,
				    new Address("A/44","Hyd"), List.of("M1","M2"),
				    Map.of("A1",10,"A2",20));
		return new ResponseEntity<>(employee,HttpStatus.OK);	
	}
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(
			@RequestBody Employee employee)
	{
		String s = employee.toString();
		ResponseEntity<String> response = new ResponseEntity<>(s,HttpStatus.OK);
		return response;
	}
}
