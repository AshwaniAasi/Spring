package collection_ci;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private int rollNo;
	private String name;
	private List<Integer> phoneNo;
	private Set<String> sub;
	private Map<String, String> address;
	private Properties prop;
	
	public Student(int rollNo, String name, List<Integer> phoneNo, Set<String> sub, Map<String, String> address,
			Properties prop) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.sub = sub;
		this.address = address;
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", phoneNo=" + phoneNo + ", sub=" + sub + ", address=" 
	+ address+", prop= "+prop+"]";
	}
	
	
	

}
