package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CertiMain {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/spring/hibernate/hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();

		Student student1 = new Student();
		student1.setStudentId(101);
		student1.setStudentName("Anuradha");
		student1.setStudentCity("kisundas");

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("spring Hibernate");
		certificate1.setDuration("12 month");
		student1.setCerti(certificate1);

		Student student2 = new Student();
		student2.setStudentId(102);
		student2.setStudentName("Ashwnai");
		student2.setStudentCity("Naseerpur");

		Certificate certificate2 = new Certificate();
		certificate2.setCourse("spring ");
		certificate2.setDuration("2 month");
		student2.setCerti(certificate2);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// object save
		session.save(student1);
		session.save(student2);
		tx.commit();
		session.close();

	}
}
