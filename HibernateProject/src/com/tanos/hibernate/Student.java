package com.tanos.hibernate;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id @GeneratedValue
	private int student_id;
	private String name;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "student_id")
//	private Student_Address student_Address;
//	
	@ManyToOne(cascade=CascadeType.ALL)
	private StudentAddress studentAddress;
	
	public StudentAddress getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress(StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getStudent_id() {
		return student_id;
	}
	
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
