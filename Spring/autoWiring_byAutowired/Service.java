package autoWiring_byAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Service 
{
	@Autowired
	@Qualifier("add2")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("I am in setter method");
	}
	// parametrize constructor need for constructor autoWiring method
	public Service(Address address) {
		super();
		this.address = address;
		System.out.println("I am in  parameterize constructor");
	}
	// default constructor need for byName and byType autowiring method
	public Service() {
		super();
		System.out.println("I am in  default constructor");
	}
	@Override
	public String toString() {
		return "Service [address=" + address + "]";
	}
	

}
