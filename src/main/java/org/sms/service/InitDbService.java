package org.sms.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;



import org.sms.entity.Student;
import org.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class InitDbService {


	@Autowired
	private StudentRepository studentRepository;

	
	@PostConstruct
	public void init() {
			

			Student student = new Student();
			student.setEnabled(1);
			student.setName("aaa");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			student.setPassword(encoder.encode("aaa"));	
			
			studentRepository.save(student);			
			
		
	}
}

