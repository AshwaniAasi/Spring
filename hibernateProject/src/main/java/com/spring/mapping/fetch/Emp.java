package com.spring.mapping.fetch;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	private int emId;
	@Column(name="Employee_Name")
	private String empName;
	@ManyToMany
	private List<Project> project;
	
	
	public int getEmId() {
		return emId;
	}
	public void setEmId(int emId) {
		this.emId = emId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Emp(int emId, String empName, List<Project> project) {
		super();
		this.emId = emId;
		this.empName = empName;
		this.project = project;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [emId=" + emId + ", empName=" + empName + ", project=" + project + "]";
	}

	
	
}
