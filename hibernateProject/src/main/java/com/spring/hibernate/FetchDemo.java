package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get()   &    load ()
		Configuration cfg = new Configuration();
		cfg.configure("com/spring/hibernate/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//get-student : 2
		Student stud = session.get(Student.class, 3 ); //with get() if object not found then throw null value
		Student stud1 = session.load(Student.class, 3 ); //with load() if object not found then throw exception
		System.out.println(stud);
		System.out.println(stud1);
		
		
		
		
	}

}
