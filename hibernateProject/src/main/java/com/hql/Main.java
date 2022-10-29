package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.spring.hibernate.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		//hql syntax:
//		String query="Select Student";
		String query="Select Student where city='lucknow'";
		
		Query q=s.createQuery(query, null);
		//for single query : (unique)
//		q.uniqueResult();
		// for multiple query : (list)
		List<Student> list = q.list();
		for (Student student:list)
		{
			System.out.println(student.getStudentName());
		}
		
		s.close();
		factory.close();
	}

}
