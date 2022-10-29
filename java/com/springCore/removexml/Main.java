package com.springCore.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	//ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/removexml/remove.xml");
	ApplicationContext context= new AnnotationConfigApplicationContext(XmlConfig.class);
	//Service ser1= context.getBean("service", Service.class);
	
	//Service ser1= context.getBean("service", Service.class); //I am in service method
//	Service ser1= context.getBean("serv1", Service.class); //I am in service method
//	Service ser1= context.getBean("temp", Service.class); //I am in service method
	Service ser1= context.getBean("anu", Service.class); //I am in service method
	
	System.out.println(ser1); //com.springCore.removexml.Service@3835c46
	
	ser1.study();		//I am in jo Sath De method	
							//I am studing
	}

}
