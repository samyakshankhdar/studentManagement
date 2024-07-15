package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student;
import com.example.demo.services.StudentService;

@RestController
@RequestMapping("/home")
public class StudentController {
	@Autowired
	StudentService studentservice;
	@PostMapping("/hello")
	public student getStudent(@RequestBody int a) {
		student stud=studentservice.getStudent(a);
		
		return stud;
	}
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody student stud) {
		studentservice.saveStudent(stud);
		return "data saved";
	}
	@PostMapping("/update-student")
	public String updateStudent(@RequestBody student stud) {
		studentservice.saveStudent(stud);
		return "Data updated";
	}
	
	
	
	

	
	
}
