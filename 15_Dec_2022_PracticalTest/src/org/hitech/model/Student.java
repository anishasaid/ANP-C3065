package org.hitech.model;

import java.util.Objects;

public class Student {
	int studentId;
	String studentName;
	String studentQualification;
	
	public Student() {
		
	}
	public Student(int sId, String sName,String sQualification) {
		studentId = sId;
		studentName = sName;
		studentQualification =sQualification;
	}
	// Setter method
	public void setStudentId(int sId) {
		studentId = sId;
	}
	public void setStdentName(String sName) {
		studentName = sName;
	}
	public void setStudentQualification(String  sQualification) {
		studentQualification =sQualification;
	}
	
	// Getter method 
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentQualification() {
		return studentQualification;
	}
	
	//Override toString
	public String toString() {
		return "Student ID :"+studentId+","+"Student Name :"+studentName+","+"Student Qualification :"+studentQualification;
	}
	//equals method
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		Student other = (Student)obj;
		return false;
			
	}
	//Hashcode method
	public int hashCode() {
		return Objects.hash(studentId, studentName, studentQualification);
	}
	
}
