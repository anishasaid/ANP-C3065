
// ********** ONE TO ONE MAPPING **********
package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name = "answer_Id")
	private int answerId;
	private String answer;
	
	@OneToOne(mappedBy= "answer")
	private Question question;
	
	
	//getter and setter
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void  setQuestion(Question question) {
		this.question = question;
	}
	public Question getQuestion() {
		return question;
	}
	//constructors
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	
	
	
	
}
