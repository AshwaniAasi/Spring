package standAlone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("standAlone/aloneconfig.xml");
		Person per1=context.getBean("person1", Person.class);
		System.out.println(per1.getName().getClass().getName());
		System.out.println(per1.getName());
		System.out.println("----------------------------------------");
		System.out.println(per1.getFeeStru().getClass().getName());
		System.out.println(per1.getFeeStru());
		System.out.println("----------------------------------------");
		System.out.println(per1.getProperty().getClass().getName());
		System.out.println(per1.getProperty());
		System.out.println("----------------------------------------");
		
		
		context.close();

	}

}
