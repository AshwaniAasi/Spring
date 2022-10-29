package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )

    {
       ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("org/example/config.xml");
       Student st1= (Student) context.getBean("studentxml");
        System.out.println(st1);

    }
}
