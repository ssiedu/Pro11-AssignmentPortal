package com.ssi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

/**
 * Servlet implementation class UpdateProfile
 */
public class UpdateProfile extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		
		StudentDAO dao=new StudentDAO();
		Student student=dao.searchById(email);
		student.setPassword(password);
		student.setMobile(mobile);
		student.setAddress(address);
		dao.saveStudent(student);
		
		response.sendRedirect("studenthome.jsp");
		
	}

}
