package collection_ci;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private final int rollNo;
	private final String name;
	private final List<Integer> phoneNo;
	private final Set<String> sub;
	private final Map<String, String> address;
	private final Properties prop;
	
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
