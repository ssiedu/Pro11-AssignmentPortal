package com.ssi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

/**
 * Servlet implementation class StudentSearchController
 */
public class StudentSearchController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read the request
			String email=request.getParameter("email");
			
		//process it using model
			
			StudentDAO dao=new StudentDAO();	
			Student student=dao.searchById(email);
			
		// preserves the processed data in scope object
			HttpSession session=request.getSession();
			session.setAttribute("data", student);
		
		//forward the request to view
			response.sendRedirect("StudentDetails.jsp");
		
	}

}
