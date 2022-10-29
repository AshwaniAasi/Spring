package com.spring.mapping.manyTomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name ="Project_Name")
	private String pName;
	@ManyToMany
	@JoinTable(name="emp_learn" ,
	joinColumns= {@JoinColumn( name="eid")},
	inverseJoinColumns= {@JoinColumn (name="pid")})
	
	private List<Emp> emp;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	public Project(int pid, String pName, List<Emp> emp) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.emp = emp;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pName=" + pName + ", emp=" + emp + "]";
	}
	
	
	

}
