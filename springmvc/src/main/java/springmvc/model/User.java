package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nameJSP;
	private String emailJSP;
	private String passwordJSP;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameJSP() {
		return nameJSP;
	}
	public void setNameJSP(String nameJSP) {
		this.nameJSP = nameJSP;
	}
	public String getEmailJSP() {
		return emailJSP;
	}
	public void setEmailJSP(String emailJSP) {
		this.emailJSP = emailJSP;
	}
	public String getPasswordJSP() {
		return passwordJSP;
	}
	public void setPasswordJSP(String passwordJSP) {
		this.passwordJSP = passwordJSP;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nameJSP=" + nameJSP + ", emailJSP=" + emailJSP + ", passwordJSP=" + passwordJSP
				+ "]";
	}
	
	

}
