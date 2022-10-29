package com.spring.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Configuration con= new Configuration().configure("com/spring/mapping/hibernate.cgf.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		//creating question
		Question ques1=new Question();
		ques1.setQuesId(1212);
		ques1.setQues("What is Java? ");
		
		// creating answer
		Answer ans1=new Answer();
		ans1.setAnsId(343);
		ans1.setAns("Java is a programming Language");
		ans1.setQues(ques1);
		ques1.setAnswer(ans1);
		
		//creating question
		Question ques2=new Question();
		ques2.setQuesId(242);
		ques2.setQues("What is Collection Framework? ");
		ques2.setAnswer(ans1);
		
		
		// creating answer
		Answer ans2=new Answer();
		ans2.setAnsId(244);
		ans2.setAns("An API to work with Java Language");
		ans2.setQues(ques2);
		ques2.setAnswer(ans2);

		//Session
		Session s= factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(ques1);
		s.save(ques2);
		s.save(ans1);
		s.save(ans2);
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
