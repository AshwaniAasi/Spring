package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Configuration con= new Configuration();
        con.configure("com/hibernate/cfg.xml");
        SessionFactory factory= con.buildSessionFactory();
        System.out.println(factory);
    }
}
