package com.hibernate.demoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stu_id;
	private StudentName name;
	private String stu_cgpa;
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public String getStu_cgpa() {
		return stu_cgpa;
	}
	public void setStu_cgpa(String stu_cgpa) {
		this.stu_cgpa = stu_cgpa;
	}
	

	

}
