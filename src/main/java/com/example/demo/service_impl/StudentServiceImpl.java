package com.example.demo.service_impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.student_repo;
import com.example.demo.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	student_repo sr;

	@Override
	public String saveStudent(student stud) {
		// TODO Auto-generated method stub
		sr.save(stud);
		return null;
	}

	@Override
	public String updateStudent(student stud) {
		// TODO Auto-generated method stub
		sr.save(stud);
		return null;
	}

	@Override
	public  student getStudent(int a) {
		// TODO Auto-generated method stub
		Optional<student> stud=sr.findById(a);
		if(stud.isPresent()) {
			student stud2=stud.get();
			return stud2;
		}
		else return new student();
		
	}

}
