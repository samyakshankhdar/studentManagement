package com.example.demo.services;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.student;
public interface StudentService {
	public String saveStudent(@RequestBody student stud);
	public String updateStudent(@RequestBody student stud);
	public student getStudent(@RequestBody int a);
}
