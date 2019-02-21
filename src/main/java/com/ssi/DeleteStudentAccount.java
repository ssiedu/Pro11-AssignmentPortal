package com.ssi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssi.dao.StudentDAO;

/**
 * Servlet implementation class DeleteStudentAccount
 */
public class DeleteStudentAccount extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id=request.getParameter("userid");
		StudentDAO dao=new StudentDAO();
		dao.deleteStudentById(id);
		response.sendRedirect("ShowRejectedAccounts");
	}

}
