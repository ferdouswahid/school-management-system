package org.sms.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;


import org.sms.entity.Student;

import org.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List< Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findOne(int id) {
		return studentRepository.findOne(id);
	}
	
	
	public void save(Student student) {
		
		student.setEnabled(1);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		student.setPassword(encoder.encode(student.getPassword()));
		studentRepository.save(student);
	}


}
