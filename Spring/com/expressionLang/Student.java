package com.expressionLang;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Student 
{	
	@Value("#{temp}")
	private List<String> city;

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [city=" + city + "]";
	}
	
	

}
