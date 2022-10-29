package stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("stereoType/stereoConfig.xml");
		System.out.println(context.getBean("obj"));

	}

}
