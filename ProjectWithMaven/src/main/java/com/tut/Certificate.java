package com.tut;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	private String course;
	private String duration;
	
	//setter and getter
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	//constructors
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterised constructor
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	
	
	
	
}
