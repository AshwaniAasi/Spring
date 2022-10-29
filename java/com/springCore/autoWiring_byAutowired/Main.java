package com.springCore.autoWiring_byAutowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/autoWiring_byAutowired/config.xml");
		System.out.println(context.getBean("emp"));
		
	}

}
