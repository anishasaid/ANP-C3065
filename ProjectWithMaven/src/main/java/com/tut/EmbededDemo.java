package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("com/tut/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create student object
		Student student1 = new Student();
		student1.setId(14134);
		student1.setName("Apeksha");
		student1.setCity("Pune");
		
		//create certificate object
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("java");
		certificate1.setDuration("2 Months");
		
		student1.setCerti(certificate1);
		
		//create another student object
		Student student2 = new Student();
		student2.setId(1212);
		student2.setName("Pritham");
		student2.setCity("Mumbai");
		
		//create another object of Certificate
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Android");
		certificate2.setDuration("1 Month");
		
		student2.setCerti(certificate2);
		
		Session s = factory.openSession();
		
		Transaction tx  = s.beginTransaction();
		
		//object save 
		s.save(student1);
		s.save(student2);
		
		tx.commit();
		
		s.clear();
		
		factory.close();
	}
	
}
		
		
		
		
