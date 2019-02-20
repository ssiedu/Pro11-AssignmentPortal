package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.ssi.entities.Assignment;

public class AllAssignmentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Assignment.class);
		List<Assignment> asglist=cr.list();
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<h3>Assignment-List</h3>");
		out.println("<table border=2>");
		out.println("<tr>");
		out.println("<th>ACode</th>");
		out.println("<th>Question</th>");
		out.println("<th>Subject</th>");
		out.println("<th>Date</th>");
		out.println("<th>FctName</th>");
		out.println("</tr>");
		
		for(Assignment asg:asglist){
			out.println("<tr>");
			out.println("<td>"+asg.getAcode()+"</td>");
			out.println("<td>"+asg.getQuestion()+"</td>");
			out.println("<td>"+asg.getSubject()+"</td>");
			out.println("<td>"+asg.getAdate()+"</td>");
			out.println("<td>"+asg.getFactulty().getFname()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("<a href=studenthome.jsp>Student-Home</a>");
		out.println("</body></html>");
		session.close();
		out.close();
	}

}
