package com.example.student.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.student.Entity.Student;
import com.example.student.student.StudentService.StudentService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {
	@Autowired
	private StudentService studServe;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student){
		System.out.println("Save Student");
		return studServe.saveStudent(student);
	}
	
	@GetMapping("/getting")
	public String gettingMthod(){
		return "Hellow";
	}
	
	@GetMapping("/student")
	public List<Student> displayAll(){
		return studServe.displayAllStudent();
	}
}
