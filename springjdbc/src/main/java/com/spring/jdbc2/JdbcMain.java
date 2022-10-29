package com.spring.jdbc2;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc2.dao.DaoImpl;
import com.spring.jdbc2.entity.Entity;

public class JdbcMain {

	public static void main(String[] args) {
		
	//	ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/jdbc2/config.xml");
		ApplicationContext con= new AnnotationConfigApplicationContext(ConfigJDBC.class);
        DaoImpl temp= con.getBean("daoImpl", DaoImpl.class);
        Scanner sc=new Scanner(System.in);
        
        //insert entry 
//        Entity entity=new Entity();
//        entity.setName("Yogender");
//        entity.setEmail("yogi@gmail.com");
//        entity.setGender("Male");
//        entity.setCity("Lucknow");
        
     //  int result = temp.insert(entity);
   //    System.out.println("new entry done : "+'\n'+result);
       
        //update entry
//        Entity entity2=new Entity();
//        entity2.setCity("Mumbai1");
//        entity2.setEmail("radhe1@gmail.com");
//        entity2.setGender("Male1");
        
//        System.out.println("what the name, where need be change");
//        String change = sc.next();
//        entity2.setName(change);
//        int result2 = temp.update(entity2);
//        System.out.println(result2);
        
        //delete entry
//        System.out.println("Enter the Name which you want to delete : ");
//        String del=sc.nextLine();
//        
//        Entity entity3=new Entity();
//        entity3.setName(del);
//        int delete = temp.delete(entity3);
//        System.out.println("Number of row get affected : "+delete);
        
        // select query for single person
//        System.out.println("Enter the name which you want to find : ");
//        String getName=sc.next();
//        Entity entityGet=new Entity();
//        entityGet.setName(getName);
//        Entity get = temp.select(entityGet);
//        System.out.println(get);
        
        // select query for all entry of DB
       List<Entity> entity=temp.allDB(null);
       for(Entity e:entity)
       {
    	   System.out.println(e);
       }
	}
}
