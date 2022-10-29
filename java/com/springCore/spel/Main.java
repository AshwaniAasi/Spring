package com.springCore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springCore/spel/spelcofig.xml");
		Student st1=con.getBean("student", Student.class);
		System.out.println(st1);
	}
}
