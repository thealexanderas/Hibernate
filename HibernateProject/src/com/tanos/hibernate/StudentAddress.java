package com.tanos.hibernate;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENTADDRESS")
public class StudentAddress {

	@Id
	@GeneratedValue
	private int student_id;
	private String address;
	
    @ManyToOne(cascade=CascadeType.ALL)
    private Student student;
    
    public Student getStudent() {
		return student;
	}
    
    public void setStudent(Student student) {
		this.student = student;
	}
	 
	public int getStudent_id() {
		return student_id;
	}
	public void setId(int student_id) {
		this.student_id = student_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
