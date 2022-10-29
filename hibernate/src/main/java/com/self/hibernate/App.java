package com.self.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        	Configuration con=new Configuration();
        	con.configure("com/self/hibernate/config.xml");
        	SessionFactory factory= con.buildSessionFactory();
        	System.out.println(factory);
        	
        	Session s = factory.openSession();
        	Transaction tx = s.beginTransaction();
        	
        	
        	//creating customer Details
        	Customer cu=new Customer();
        	cu.setId(101);
        	cu.setName("Rajesh");
        	cu.setCity("Sidhari");
        	cu.setPhoneNo("7007581106");
//        	cu.setAccount();
        	
        	//creating account details
        	Account ac=new Account();
        	ac.setAccountNo(2022101);
        	ac.setId(101);
        	ac.setIfscNo("UBIN05462");
        	ac.setCustomer(cu);
        	
        	s.save(cu);
        	s.save(ac);
        	tx.commit();
        	s.close();
    }
}
