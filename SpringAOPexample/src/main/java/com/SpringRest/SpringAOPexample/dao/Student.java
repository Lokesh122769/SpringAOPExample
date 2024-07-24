package com.SpringRest.SpringAOPexample.dao;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	private String name;
	
	private String branch;
	
	private String rollno;
	
	private Double cgpa;

	public Student() {
		super();
	}

	public Student(Integer id, String name, String branch, String rollno, Double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", rollno=" + rollno + ", cgpa=" + cgpa
				+ "]";
	}
	
	
	
}
