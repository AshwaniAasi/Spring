package com.spring.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;

public class App {
	public static void main(String[] args) throws Exception {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
		// creating new student
		Student st1=new Student();
		 st1.setStudentId(1);
		 st1.setStudentName("Monicka");
		 st1.setStudentCity("TamilNadu");
		
		 Student st2=new Student();
		 st1.setStudentId(2);
		 st1.setStudentName("Gurlin Jass");
		 st1.setStudentCity("Punjab");
		 
		 Student st3=new Student();
		 st1.setStudentId(3);
		 st1.setStudentName("Priyadarshni");
		 st1.setStudentCity("TamilNadu");

		// creating object of address class
		Address ad = new Address();
		ad.setStreet("street 2");
		ad.setCity("Azamgarh");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.56);

		// Reading image

		FileInputStream fis = new FileInputStream("src/main/java/com/spring/hibernate/mypic.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.save(ad);
		tx.commit();
		session.close();

		System.out.println("Done...");

	}
}
