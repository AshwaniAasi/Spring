package com.spring.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student 
{	@Id
	private int studentId;
	private String studentName;
	private String studentCity;
	private Certificate certi;
	
	public int getStudentId() {return studentId;}
	public void setStudentId(int studentId) {	this.studentId = studentId;}
	public String getStudentName() {return studentName;}
	public void setStudentName(String studentName) {this.studentName = studentName;}
	public String getStudentCity() {return studentCity;}
	public void setStudentCity(String studentCity) {	this.studentCity = studentCity;}
	public Certificate getCerti() {return certi;	}
	public void setCerti(Certificate certi) {this.certi = certi;}
	public Student(int studentId, String studentName, String studentCity, Certificate certi) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.certi = certi;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	

	
	
	
}
