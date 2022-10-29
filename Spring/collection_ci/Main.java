package collection_ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("collection_ci/config.xml");
		Student st1=(Student) context.getBean("StudentXML");
		System.out.println(st1);
	}

}
