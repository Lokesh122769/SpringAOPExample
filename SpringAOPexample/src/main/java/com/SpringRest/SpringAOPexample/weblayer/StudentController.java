package com.SpringRest.SpringAOPexample.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringAOPexample.dao.Student;
import com.SpringRest.SpringAOPexample.service.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentController
{
	@Autowired
    private IStudentService service;
	
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Student student) throws Exception
	{
		return new ResponseEntity<Student>(service.registerStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<?> getAllStudents()
	{
		return new ResponseEntity<>(service.fetchAllStudents(),HttpStatus.ACCEPTED);   
	}
}
