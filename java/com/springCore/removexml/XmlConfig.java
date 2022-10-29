package com.springCore.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springCore.removexml")
public class XmlConfig {
	
	@Bean
	public Sathi jasathi()
	{
		return new Sathi();
	}
	
	@Bean( name = {"serv1", "temp","anu" })
	public Service service()
	{
		Service ser=new Service(jasathi());
		System.out.println("I am in service method");
		return ser;
		
	}

}
