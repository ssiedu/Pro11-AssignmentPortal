package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.entities.Faculty;

public class SaveFaculty extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//reading user inputs
		String fcode=request.getParameter("fcode");
		String password=request.getParameter("password");
		String fname=request.getParameter("fname");
		String qualf=request.getParameter("qualf");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		
		//creating entity object
		Faculty f=new Faculty(fcode,password,fname,qualf,address,mobile,email);
		
		//storing object using hibernate
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(f);
		tr.commit();
		session.close();
		
		PrintWriter out=response.getWriter();
		out.println("Faculty Information Stored");
		out.close();
		
		
		
	}

}
