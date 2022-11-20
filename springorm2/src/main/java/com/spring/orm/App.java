package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import com.sun.xml.bind.v2.runtime.output.XMLStreamWriterOutput;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//       Student student=new Student(2326, "Ashwani kumar", "Lucknow");  
//       int r = studentDao.insert(student);
//       System.out.println("done"+r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		
		while (go) {
			System.out.println("Hey!!\nPlease choose below one...\n");
			System.out.println("press 1 for add student");
			System.out.println("press 2 for dispaly all student");
			System.out.println("press 3 for get details of single student");
			System.out.println("press 4 for delete student");
			System.out.println("press 5 for update student");
			System.out.println("press 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add new student
					System.out.println("Enter user id");
					int uId = Integer.parseInt(br.readLine());

					System.out.println("Enter user name");
					String uName = br.readLine();

					System.out.println("Enter user city");
					String uCity = br.readLine();

					Student s = new Student(uId, uName, uCity);

					int r = studentDao.insert(s);
					System.out.println(r + " student addedd");
					System.out.println("******************************");
					System.out.println();
					break;
				case 2:
					// display all student

					List<Student> allStudent = studentDao.getAllStudent();
					for (Student st : allStudent) {
						System.out.println("_________________________________");

						System.out.println("Id " + st.getStudentId());

						System.out.println("Name " + st.getStudentName());

						System.out.println("City " + st.getStudentCity());

						System.out.println("--------------------------------");
					}

					break;
				case 3:
					// get details single student
					System.out.println("Enter user id");
					int userId = Integer.parseInt(br.readLine());
					Student student = studentDao.getStudent(userId);
					System.out.println("_________________________________");

					System.out.println("Id " + student.getStudentId());

					System.out.println("Name " + student.getStudentName());

					System.out.println("City " + student.getStudentCity());

					System.out.println("--------------------------------");

					break;
				case 4:
					// delete student
					System.out.println("Enter user id");
					int deleteId = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(deleteId);
					System.out.println("***********************");
					System.out.println("Student Deleted...");
					break;
				case 5:
					// update student
					System.out.println("Enter user id where you want to update");
					System.out.println("Sorry !! program need to wrote");
					break;
				case 6:
					// exit
					go = false;
					break;

				}
			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank you to using my application");
		System.out.println("See you soon !!");
	}
}
