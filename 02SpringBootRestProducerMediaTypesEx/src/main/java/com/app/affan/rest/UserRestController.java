package com.app.affan.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.affan.entity.Role;
import com.app.affan.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/one")
	public ResponseEntity<User> getOneObj()
	{
		User ob = new User(101,"Ahmed","Developer","Password123",
				Set.of("P1","P2"),
				Map.of("M1","AA","M2","AB")
				);
		ResponseEntity<User> response = new ResponseEntity<>(ob,HttpStatus.OK);
		return response ;
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Role>> getAllRoles()
	{
		List<Role> roles=  Arrays.asList(
				new Role(1100,"ADMIN"),
				new Role(1101,"BA"),
				new Role(1102,"DEV")
				);
		ResponseEntity<List<Role>> response = new ResponseEntity<>(roles,HttpStatus.OK);
		return response ;
	}
	
	@GetMapping("/map")
	public ResponseEntity<Map<String,Role>> getMappedRoles()
	{
		Map<String,Role> rolesMap =  Map.of(
				"R1",new Role(1100,"ADMIN"),
				"R2",new Role(1101,"BA"),
				"R3",new Role(1102,"DEV")
				);
		ResponseEntity<Map<String,Role>> response = new ResponseEntity<>(rolesMap,HttpStatus.OK);
		return response ;
	}
}
