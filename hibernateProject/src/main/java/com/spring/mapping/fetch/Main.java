package com.spring.mapping.fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.spring.mapping.Question;

public class Main {

	public static void main(String[] args) {
		
		Configuration con= new Configuration();
		con.configure("com/spring/mapping/fetch/hibernate.cgf.xml");
		SessionFactory sf=con.buildSessionFactory();
		
		//creating Emp
		Emp em1=new Emp();
		em1.setEmId(101);
		em1.setEmpName("Ashwani");
		Emp em2=new Emp();
		em2.setEmId(102);
		em2.setEmpName("Anuradha");
		
		//creating project 
		Project pro1= new Project();
		pro1.setPid(50);
		pro1.setpName("NationWide");
		Project pro2= new Project();
		pro2.setPid(51);
		pro2.setpName("Travelars");
		
		List<Emp> le1=new ArrayList<Emp>();
		le1.add(em1);
		le1.add(em2);
		
		List <Project> lp1= new ArrayList<Project>();
		lp1.add(pro1);
		lp1.add(pro2);
		
		pro1.setEmp(le1);
		em1.setProject(lp1);
		
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Emp q=s.get(Emp.class, 101);
		System.out.println(q.getEmId());
		System.out.println(q.getEmpName());
		tx.commit();
		s.close();
		sf.close();
		
	}

}
