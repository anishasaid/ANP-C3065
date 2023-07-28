
// ********** ONE TO MANY MAPPING **********
package com.map1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	@Column(name = "question_Id")
	private  int questionId;
	
	private String qustion;
	
	@OneToMany(mappedBy = "question")
	//created a list to store many answers
	private List<Answer> answers; 
	
	//setter and getter
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQustion() {
		return qustion;
	}

	public void setQustion(String qustion) {
		this.qustion = qustion;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	//constructors
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionId, String qustion, List<Answer> answers) {
		super();
		this.questionId = questionId;
		this.qustion = qustion;
		this.answers = answers;
	}

	
	
	
	
	
}
