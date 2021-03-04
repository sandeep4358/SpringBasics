package com.test.service;

/**
 * 
 * @author sandeep.kumar
 *
 */

public class Alien {	
	
	public Alien(int aid, String name, int marks) {
		super();
		Aid = aid;
		this.name = name;
		this.marks = marks;
	}
	int Aid;
	String name;
	int marks;
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alien [Aid=" + Aid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
