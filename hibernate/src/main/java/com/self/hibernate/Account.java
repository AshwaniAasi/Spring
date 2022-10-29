package com.self.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account 
{
	@Id
	@Column(name="Account Id")
	private int id;
	@Column(name="Account Number")
	private int accountNo;
	@Column(name="Account IFSC")
	private String ifscNo;
	
	@OneToOne
	private Customer customer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscNo() {
		return ifscNo;
	}
	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, int accountNo, String ifscNo, Customer customer) {
		super();
		this.id = id;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNo=" + accountNo + ", ifscNo=" + ifscNo + ", customer=" + customer + "]";
	}
	
	
	
	
}
