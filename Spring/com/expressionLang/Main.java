package com.expressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/expressionLang/config.xml");
		System.out.println(con.getBean("student"));
	}

}
