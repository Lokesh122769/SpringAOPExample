package com.SpringRest.SpringAOPexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SpringAOPexample.dao.IStudentRepo;
import com.SpringRest.SpringAOPexample.dao.Student;


@Service
public class StudentServiceImpl implements IStudentService
{
	
	private IStudentRepo repo;  
	
	

	@Autowired
	public void setRepo(IStudentRepo repo)
	{
		this.repo = repo;
	}

	@Override
	public Student registerStudent(Student student) throws Exception
	{
		if(student.getName().length()!=4)
			throw new Exception("Invalid Name");
		else
		return repo.save(student);
	}

	@Override
	public Iterable<Student> fetchAllStudents()
	{
		return repo.findAll();
	}

}
