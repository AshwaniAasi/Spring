package com.self.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer 
{
	@Id
	@Column(name="Customer Id")
	private int id;
	@Column(name="Customer Name")
	private String name;
	@Column(name="Customer City")
	private String city;
	@Column(name="Customer Phone No")
	private String phoneNo;
	@OneToOne
	private Account account;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Customer(int id, String name, String city, String phoneNo, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.phoneNo = phoneNo;
		this.account = account;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", phoneNo=" + phoneNo + ", account="
				+ account + "]";
	}
}
