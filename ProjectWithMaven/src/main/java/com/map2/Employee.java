
// ********** MANY TO MANY MAPPING **********
package com.map2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	private List<Project> projects;
	
	//getter and setter
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	//constructors
	public Employee(){
		super();
	}
	
	public Employee(int eid, String name, List<Project> projects ){
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	
}
