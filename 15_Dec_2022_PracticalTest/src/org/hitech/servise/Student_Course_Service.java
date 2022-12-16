package org.hitech.servise;

import java.util.HashMap;

import org.hitech.model.Course;
import org.hitech.model.Student;
import org.hitech.dao.*;

public class Student_Course_Service {
	public Student_Course_DAO scDAO = new Student_Course_DAO ();
	
	
	public boolean  addStudentCourseDetails(Student student,Course course) {
		boolean  addStatus= scDAO.addStudentCourseDetails(student ,course);
		return addStatus;
	}
	
	public HashMap<Student,Course> getStudentCourseDetails() {
		HashMap<Student,Course> hashmap = scDAO.getStudentCourseDetails();
		return hashmap;
	}
	
	public boolean   deleteStudentCourseDetails() {
		boolean  addStatus= scDAO.deleteStudentCourseDetails(student);
		return addStatus;
	}
}
