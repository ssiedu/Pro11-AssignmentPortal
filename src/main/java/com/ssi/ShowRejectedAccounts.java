package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

/**
 * Servlet implementation class ShowRejectedAccounts
 */
public class ShowRejectedAccounts extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentDAO dao=new StudentDAO();
		List<Student> students=dao.getAllAccountsByStatus("rejected");
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Student Account Request</h3>");
		out.println("<hr>");
		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<th>Name</th><th>Address</th><th>Mobile</th><th>Email</th><th>Activate</th><th>Rejected</th>");
		out.println("</tr>");
		for(Student s:students){
			String name=s.getSname();
			String address=s.getAddress();
			String mobile=s.getMobile();
			String email=s.getEmail();
			out.println("<tr>");
			out.println("<td>"+name+"</td>");
			out.println("<td>"+address+"</td>");
			out.println("<td>"+mobile+"</td>");
			out.println("<td>"+email+"</td>");
			out.println("<td><a href=ChangeStatus?userid="+email+"&status=activated>Activate</a></td>");
			out.println("<td><a href=DeleteStudentAccount?userid="+email+">Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<hr>");
		out.println("<a href=adminhome.jsp>AdminHome</a><br>");
		out.println("</body></html>");
		
		
	}

}
