package collection;

import java.util.Map;
import java.util.Properties;
import java.util.List;
import java.util.Set;

public class Student 
{
	private String name;
	private List<Integer> phoneNo;
	private Set<String> address;
	private Map<String, String> course;
	private Properties prop;
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", course=" + course
				+ ", prop=" + prop + "]";
	}
	
	
	
	
	
}
