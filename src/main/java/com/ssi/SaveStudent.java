package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;
public class SaveStudent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String sname=request.getParameter("sname");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		
		Student s=new Student(email,password,sname,address,mobile);
	
		StudentDAO dao=new StudentDAO();
		dao.saveStudent(s);
		
	/*	
	 * Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	*/
		
		PrintWriter out=response.getWriter();
		out.println("Registration Completed");
		out.println("Your Account Will Be Activated Soon");
		out.println("After Activation, You Can Login To Our Portal");
		out.close();
		
	}

}
