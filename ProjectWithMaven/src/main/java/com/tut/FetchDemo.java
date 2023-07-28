package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		//get , load 
		
		Configuration cfg = new Configuration();
		cfg.configure("com/tut/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//get- strudent id = 101
		 Student student = (Student) session.load(Student.class, 101);
		 System.out.println(student);
		 
		 //load
		 Address ad  = (Address)session.get(Address.class, 1);
		 System.out.println(ad.getCity() + " "+ ad.getStreet());
		
		session.clear();
		factory.close();
	}

}
