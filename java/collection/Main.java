package collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("collection/Collection.xml");
		Student emp=(Student) context.getBean("student1");
		System.out.println("Name : "+emp.getName());
		System.out.println("Address : "+emp.getAddress());
		System.out.println("Course : "+emp.getCourse());
		System.out.println("Phone No. : "+emp.getPhoneNo());
		System.out.println("Property : "+emp.getProp());
		
		
	}
}
