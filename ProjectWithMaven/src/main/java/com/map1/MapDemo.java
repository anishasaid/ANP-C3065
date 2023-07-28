package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		//create an object of Question
//		Question q1 = new Question();
//		q1.setQuestionId(1);
//		q1.setQustion("What is java ?");
//		
//		//create an object of Answer
//		Answer answer1 = new Answer();
//		answer1.setAnswerId(9);
//		answer1.setAnswer("Java is a programming lagnguage");
//		answer1.setQuestion(q1);
//		
//		Answer answer2 = new Answer();
//		answer2.setAnswerId(10);
//		answer2.setAnswer("Java is platform independant language");
//		answer2.setQuestion(q1);
//		
//		Answer answer3 = new Answer();
//		answer3.setAnswerId(11);
//		answer3.setAnswer("Java has many frameworks");
//		answer3.setQuestion(q1);
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(answer1);
//		list.add(answer2);
//		list.add(answer3);
//		
//		q1.setAnswers(list);
//		
		//create session
		Session session = factory.openSession();
		
		//create transaction
		Transaction tx =  session.beginTransaction();
		
		//save
//		session.save(q1);
//		session.save(answer1);
//		session.save(answer2);
//		session.save(answer3);
		
		Question q = (Question)session.get(Question.class, 1);
		
		System.out.println(q.getQustion());
		
		for(Answer a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		tx.commit();
		session.close();
		factory.close();
	}

}
