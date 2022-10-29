package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("#{22+11}")
	private int x;
	
	@Value("#{2+5+6+3}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(81) }") //for calling static method through annotation
	private double z;
	
	@Value("#{ T(java.lang.Math).PI}")  //for calling static variable through annotation
	private double a;
	
	@Value("#{new java.lang.String('Ashwani Chaurasiya') }") //for creating and calling object through annotation
	private String name;
	
	@Value("#{8>3}") //for boolean value calling through annotation
	private boolean kaisaH;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isKaisaH() {
		return kaisaH;
	}
	public void setKaisaH(boolean kaisaH) {
		this.kaisaH = kaisaH;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", kaisaH=" + kaisaH + "]";
	}
	
	
	
	
	
}
