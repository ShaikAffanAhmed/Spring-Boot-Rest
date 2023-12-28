package com.app.affan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@GetMapping("/fetch")
	public ResponseEntity<String> getStudent()
	{
		ResponseEntity<String> response = new ResponseEntity<>(
				"FROM GET RESPONSE",
				HttpStatus.OK);
		        return response;			
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> createStudent()
	{
		ResponseEntity<String> response = new ResponseEntity<>(
				"FROM POST RESPONSE",
				HttpStatus.OK);
		        return response;			
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudentName()
	{
		ResponseEntity<String> response = new ResponseEntity<>(
				"FROM PUT RESPONSE",
				HttpStatus.OK);
		        return response;			
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteStudent()
	{
		ResponseEntity<String> response = new ResponseEntity<>(
				"FROM DELETE RESPONSE",
				HttpStatus.OK);
		        return response;			
	}
	
	@PatchMapping("/updateStudentEmail")
	public ResponseEntity<String> updateStudentEmail()
	{
		ResponseEntity<String> response = new ResponseEntity<>(
				"FROM PATCH RESPONSE",
				HttpStatus.OK);
		        return response;			
	}
}
