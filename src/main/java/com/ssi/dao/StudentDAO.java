package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.ssi.Data;
import com.ssi.entities.Student;

public class StudentDAO {

	SessionFactory sf;
	
	public StudentDAO(){
		sf=Data.getSF();
	}
	
	public List<Student> getAllAccountsByStatus(String status){
		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Student.class);
		Criterion crt=Restrictions.eq("status", status);
		cr.add(crt);
		List<Student> list=cr.list();
		session.close();
		return list;
	}
	
	public Student searchById(String id){
		Session session=sf.openSession();
		Student student=session.get(Student.class, id);
		session.close();
		return student;
		
	}
	
	public void deleteStudentById(String email){
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		String hql="delete from Student where email=:id";
		Query qr=session.createQuery(hql);
		qr.setParameter("id", email);
		qr.executeUpdate();
		/*Student st=new Student();
		st.setEmail(email);
		session.delete(st);*/
		tr.commit();
		session.close();
	}
	public void saveStudent(Student student){
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}
	
	
	
}
