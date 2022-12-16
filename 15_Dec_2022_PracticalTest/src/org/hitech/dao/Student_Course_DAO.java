package org.hitech.dao;
import org.hitech.model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student_Course_DAO {
	public static HashMap<Student, Course> hashmap = new HashMap<Student, Course>();
	
	public boolean addStudentCourseDetails(Student student , Course course){
		boolean addStatus = false;
		hashmap.put(student ,course);
		return addStatus;
	}
	public HashMap<Student,Course> getStudentCourseDetails(HashMap<Student,Course>hashmap){
		Set keys = hashmap.keySet();
		Iterator i = keys.iterator();
		while(i.hasNext()) {
			return (HashMap<Student, Course>) i.next();
		}
		Collection getValues= hashmap.values();
		i= getValues.iterator();
		while(i.hasNext()) {
			return (HashMap<Student, Course>) i.next(); 
		}
		return hashmap;
//		for(HashMap.Entry<Student,Course> entry : hashmap.entrySet()) {
//			System.out.println(entry.getKey()+ " "+ entry.getValue());
//		}
//		return hashmap;
	}
	public HashMap<Student,Course> deleteStudentCourseDetails(Student student){
		boolean addStatus = false;
		hashmap.remove(getClass());
		return hashmap;
	}
}
