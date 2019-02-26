package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.entities.Assignment;
import com.ssi.entities.Faculty;

public class SaveAssignment extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int acode=Integer.parseInt(request.getParameter("acode"));
		String question=request.getParameter("que");
		String subject=request.getParameter("subject");
		String fcode=(String)request.getSession().getAttribute("user");
		java.util.Date dt1=new java.util.Date();
		java.sql.Date dt2=new java.sql.Date(dt1.getTime());
		
		Assignment asg=new Assignment();
		asg.setAcode(acode); 
		asg.setQuestion(question);
		asg.setAdate(dt2);
		asg.setSubject(subject);
		asg.setFactulty(new Faculty(fcode));
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(asg);
		tr.commit();
		session.close();
		PrintWriter out=response.getWriter();
		out.println("Assignment Successfully Uploaded");
		out.close();
	}

}
