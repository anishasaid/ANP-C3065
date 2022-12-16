package org.hitech.model;

import java.util.Objects;

public class Course {
	int courseId;
	String courseName;
	double coursePrice;
	
	public Course() {
		
	}
	public Course(int cId,String cName, double cPrice) {
		courseId = cId;
		 courseName = cName;
		 coursePrice =cPrice;
	}
	//setter 
	public void setCourseId(int cId) {
		courseId =cId;
	}
	public void setCourseName(String cName) {
		courseName =cName;
	}
	public void setCoursePrice(double cPrice) {
		coursePrice =cPrice;
	}
	//getter
	public int getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	//Override toString
	public String toString() {
		return "Course Id:"+courseId+","+"Course Name:"+courseName+","+"Course Prise:"+coursePrice;
	}
	//equals
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		Course other = (Course)obj;
		return false;
	}
	//HashCode
	public int hashCode() {
		return Objects.hash(courseId, courseName,coursePrice);
	}
}
