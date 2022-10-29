package com.springCore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/stereoType/stereoConfig.xml");
	//	System.out.println(context.getBean("obj"));
			Student stu1= context.getBean("student", Student.class);
			System.out.println(stu1);

	}

}
