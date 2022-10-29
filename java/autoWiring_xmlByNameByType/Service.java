package autoWiring_xmlByNameByType;

import org.springframework.beans.factory.annotation.Autowired;

public class Service 
{
	
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		// parametrize constructor need for constructor autoWiring method
	public Service(Address address) {
		super();
		this.address = address;
		System.out.println("hey");
	}
		// default constructor need for byName and byType autowiring method
	public Service() {
		super();
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Service [address=" + address + "]";
	}
	

}
