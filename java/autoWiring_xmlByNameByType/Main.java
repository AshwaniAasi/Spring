package autoWiring_xmlByNameByType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("autoWiring_xmlByNameByType/config.xml");
		System.out.println(context.getBean("emp"));
		
	}

}
