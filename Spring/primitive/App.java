package primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
//by using only setter method
	public static void main(String[] args) 
	{

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("primitive/config.xml");
		System.out.println(context.getBean("Student1"));
		System.out.println(context.getBean("Student2"));
	}

}
