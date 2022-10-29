package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	//spring jdbc => Jdbc Template
        ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");
        JdbcTemplate temp= con.getBean("JDBCTm", JdbcTemplate.class);
        
        //insert Query
        String query="insert into register(name, email, gender, city) value(?, ?, ?, ?)";
        
        //fire query
      // int fire1= temp.update(query, "Rahul Yadav", "rahul@gamil.com","Male","Lucknow");
       // int fire1= temp.update(query, "Manisha Yadav", "manisha@gamil.com","Female","Delhi");
         int fire1= temp.update(query, "Harshita Yadav", "harsh@gamil.com","Female","Mau");
       System.out.println("Query inserted Successfully : "+fire1);
        
    }
}
