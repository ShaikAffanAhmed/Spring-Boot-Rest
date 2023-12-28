package com.app.affan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid")
	private Integer stdId;
	
	@Column(name = "sname")
	//@NotNull(message = "Name cannot be null")
	//@NotEmpty(message = "STUDENT NAME CANNOT BE EMPTY")
	@NotBlank(message = "STUDENT NAME CANNOT BE EMPTY")
	@Size(min = 2, max = 6, message = "NAME MUST BE 2-6 CHARS ONLY")
	@Pattern(regexp = "[A-Za-z]{2,6}", message = "Only A-Z/a-z are allowed")
	private String stdName;
	
	@Column(name = "sgen")
	@NotBlank(message = "STUDENT GENDER CANNOT BE EMPTY")
	private String stdGen;
	
	@Column(name = "scourse")
	@NotBlank(message = "STUDENT COURSE MUST BE SELECTED")
	private String stdCourse;
	
	@Column(name = "saddr")
	@Pattern(regexp = "[A-Za-z0-9\\.\\-\\?]{10,250}" ,message = "INVALID ADDREESS DETAILS") 
	private String stdAddr;
	
}
