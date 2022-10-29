package primitive_ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("primitive_ci/config.xml");
		Student st1= (Student) context.getBean("person1");
		System.out.println(st1);
	}

}
