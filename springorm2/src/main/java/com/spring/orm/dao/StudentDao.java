package com.spring.orm.dao;

import java.util.List;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

//================== C U R D =========================

	// ------------------ Create Data -----------------
	@Transactional
	public int insert(Student student) {
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	// ---------------- Update Data ------------------

	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	// ----------------Read Data----------------------
	// get the single data
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	// get multiple data
	public List<Student> getAllStudent() {
		List<Student> all = this.hibernateTemplate.loadAll(Student.class);
		return all;
	}

	// ---------------------- Delete Data ---------------

	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

//=========================================================

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
