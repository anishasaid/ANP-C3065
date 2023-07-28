package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		//create an object of Question 
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java ?");
		
		//creating object of Answer 
		Answer answer1 = new Answer();
		answer1.setAnswerId(343);
		answer1.setAnswer("Java is a Programming language");
		answer1.setQuestion(q1);
		q1.setAnswer(answer1);
		//*****************************************************************************************************
		//create an object of Question 
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is collection framework  ?");
				
		//creating object of Answer 
		Answer answer2 = new Answer();
		answer2.setAnswerId(344);
		answer2.setAnswer("API to work with object in java ");
		answer2.setQuestion(q2);	
		q2.setAnswer(answer2);
		
		
		
		//create sesson object
		Session s = factory.openSession();
		
		//create Transaction
		Transaction tx  = s.beginTransaction();
		
		//save
		s.save(q1);
		s.save(q2);
		s.save(answer1);
		s.save(answer2);
		
		tx.commit();
		
		Question newQ = (Question) s.get(Question.class, 242);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		s.close();
		
		factory.close();
	}

}
