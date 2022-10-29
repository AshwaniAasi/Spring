package com.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con= new ClassPathXmlApplicationContext("com/springorm/config.xml");
        StudentDao studentDao= con.getBean("studentDao", StudentDao.class);
        
//        Student st1= new Student(01,"Ashwani Chaurasiya", "Azamgarh");
//        int i= studentDao.insert(st1);
//        System.out.println("done : "+i);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag=true;
        while (flag)
        {
        	System.out.println("PRESS 1 for Add new Student");
            System.out.println("PRESS 2 for Display all Student ");
            System.out.println("PRESS 3 for get Details of single Student");
            System.out.println("PRESS 4 for Delete Student");
            System.out.println("PRESS 5 for Update Student");
            System.out.println("PRESS 6 for exit");
        }
        try
        {
        	int input = Integer.parseInt(br.readLine());
        	switch (input) 
        	{
				case 1:
					//add new student				
					break;
				case 2:
					//display all student				
					break;
				case 3:
					//details of single student				
					break;
				case 4:
					//delete student				
					break;
				case 5:
					//Update student				
					break;
				case 6:
					//exit
					flag=false;
					break;
	
			
			}
        }
        catch (Exception e)
        {
        	System.out.println("Invalid input try again");
        	System.out.println(e.getMessage());
        }
        
    }
}
