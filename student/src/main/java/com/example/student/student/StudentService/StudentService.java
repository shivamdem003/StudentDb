package com.example.student.student.StudentService;

import java.util.List;

import com.example.student.student.Entity.Student;

public interface StudentService {

	Student saveStudent(Student student);
	List<Student> displayAllStudent();

}
