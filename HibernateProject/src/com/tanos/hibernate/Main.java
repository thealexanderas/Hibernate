package com.tanos.hibernate;

import java.lang.annotation.Annotation;
import java.util.Date;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;
import com.fasterxml.classmate.AnnotationInclusion;
// Load class
public class Main {

	public static void main(String args[]) {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		
		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress(JOptionPane.showInputDialog("Student Address :"));
		
		Student student1 = new Student();
		student1.setName(JOptionPane.showInputDialog("First Student Name:"));
		student1.setStudentAddress(studentAddress);
		
		Student student2 = new Student();
		student2.setName(JOptionPane.showInputDialog("Second Student Name : "));
		student2.setStudentAddress(studentAddress);
		
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
//			session.save(student_address);
			session.save(student1);
			session.save(student2);
			session.getTransaction().commit();
			JOptionPane.showMessageDialog(null, "Student successfully added");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}finally {
			if(session != null){
				session.close();
				sessionFactory.close();	
			}
		}
	}

}
