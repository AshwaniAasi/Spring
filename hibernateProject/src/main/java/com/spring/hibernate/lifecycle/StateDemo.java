package com.spring.hibernate.lifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo
{
	public static void main(String[] args) 
	{
		//Transient state
		// Persistent state
		// Detached state
		// Removed state
		
		System.out.println("e");
		SessionFactory f=new Configuration().configure("com/spring/hibernate/lifecycle/hibernate.cfg.xml").buildSessionFactory();
	
		//creating student object
		Student student= new Student();
		student.setStudentId(1414);
		student.setStudentName("new name");
		student.setStudentCity("New delhi");
		student.setCerti(new Certificate("Java Hibernate course","2 months"));
	
	// student : transient state
		
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(student);
		
	// Persistent state = session and Database both accociated
		student.setStudentName("jOhn");
		tx.commit();
		s.close();
	// student : Detached State bcz joney not storing in DB
		student.setStudentName("joney");
		System.out.println(student);
		f.close();
		
		
		
	
	
	}
}
