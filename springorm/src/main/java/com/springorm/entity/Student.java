package com.springorm.entity;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name ="student_details")
public class Student {
	@Id
	@Column(name="Student Id")
	private int studentId;
	@Column(name="Student Name")
	private String studentName;
	@Column(name="Student City")
	private String studentCity;
	
	public int getStudentId() {	return studentId;	}
	public void setStudentId(int studentId) {	this.studentId = studentId;	}
	
	public String getStudentName() {	return studentName;	}
	public void setStudentName(String studentName) {	this.studentName = studentName;	}
	
	public String getStudentCity() {	return studentCity;	}
	public void setStudentCity(String studentCity) {	this.studentCity = studentCity;	}
	
	
	
	public Student() 
	{	}
	
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	@Override
	public String toString() {
		return "Entity [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity + "]";
	}
	
	

}
