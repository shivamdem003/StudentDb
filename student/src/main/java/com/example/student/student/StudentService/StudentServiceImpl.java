package com.example.student.student.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.student.Entity.Student;
import com.example.student.student.StudentRepo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> displayAllStudent() {
		return studentRepo.findAll();
	}
}
