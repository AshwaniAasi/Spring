package lifeCycle_interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifeCycle_interface/config.xml");
		
		System.out.println(context.getBean("ServiceInterfaceXML"));
		context.registerShutdownHook();

	}

}
