package com.springCore.removexml;

import org.springframework.stereotype.Component;

//@Component
public class Service {
	private Sathi sathi;
	
	public Service(Sathi sathi) {
		super();
		this.sathi = sathi;
	}
	void study()
	{
		sathi.josathDe();
		System.out.println("I am studing");
	}

}
