package com.spring.mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Configuration con= new Configuration().configure("com/spring/mapping/OneToMany/hibernate.cgf.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		//ques1
		Question qu1=new Question();
		qu1.setQuesId(101);
		qu1.setQues("what is java?");
		
		//ans1
		Answer ans1=new Answer();
		ans1.setAnsId(101-1);
		ans1.setAns("Java is a programming Language");
		ans1.setQues(qu1);
		
		//ans2
		Answer ans2=new Answer();
		ans2.setAnsId(101-2);
		ans2.setAns("Java is OOPs language");
		ans2.setQues(qu1);
		
		//ans3
		Answer ans3=new Answer();
		ans3.setAnsId(101-3);
		ans3.setAns("Java is a procudural language");
		ans3.setQues(qu1);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		qu1.setAnswer(list);
		
		//Session
		Session s= factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(qu1);
		s.save(ans1);
		s.save(ans2);
		s.save(ans3);
		
		//fetching data
		Question q = s.get(Question.class, 101);
		System.out.println(q.getQues());
		
		for(Answer a: q.getAnswer())
		{
			System.out.println(a.getAns());
		}
		
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
