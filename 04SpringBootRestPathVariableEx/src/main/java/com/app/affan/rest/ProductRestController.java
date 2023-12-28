package com.app.affan.rest;

import java.util.Enumeration;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductRestController {
  
	//Using RequestParam
	//.../dataa?pid=10&pname=A
	@GetMapping("/dataa")
	public ResponseEntity<String> showDataA(
			@RequestParam("pid") Integer id,
			@RequestParam("pname") String name)
	{
		System.out.println("PID " + id + " PNAME " + name);
		return new ResponseEntity<>("PID " + id + " PNAME " + name,HttpStatus.OK);
	}
	
	//Using PathVariable 
	//.../datab/10/A
	@GetMapping("/datab/{pid}/{pname}")
	public ResponseEntity<String> showDataB(
			@PathVariable("pid") Integer id,
			@PathVariable("pname")String name
			)
	{
		System.out.println("PID " + id + " PNAME " + name);
		return new ResponseEntity<>("PID " + id + " PNAME " + name,HttpStatus.OK);
	}
	
	@PostMapping("/details")
	public ResponseEntity<String> showHeaders(
			@RequestHeader("Content-Type") String type,
			@RequestHeader("Content-Length") String length,
			@RequestHeader("Authorization") String auth,
			HttpServletRequest req
			)
	{
		System.out.println(auth);
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements())
		{
			String hdr = headerNames.nextElement();
			System.out.println(hdr +" "+ req.getHeader(hdr));
		} 
		System.out.println("Data"+ type +" - "+ length);
		return new ResponseEntity<>("CHECK",HttpStatus.OK);
	}
		  
}
