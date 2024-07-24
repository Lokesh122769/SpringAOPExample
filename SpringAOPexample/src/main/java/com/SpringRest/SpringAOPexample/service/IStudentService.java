package com.SpringRest.SpringAOPexample.service;

import com.SpringRest.SpringAOPexample.dao.Student;

public interface IStudentService
{

	public Student registerStudent(Student student) throws Exception;
	
	public Iterable<Student> fetchAllStudents();
	
}
