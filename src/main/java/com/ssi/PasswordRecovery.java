package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssi.dao.StudentDAO;

public class PasswordRecovery extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		String useremail=request.getParameter("email");
		StudentDAO dao=new StudentDAO();
		String password=dao.getPassword(useremail);
		out.println("<html><body>");
		if(password.equals("wrongemail")){
			out.println("Invalid Email Address ");
			out.println("<h3><a href=recoverpassword.jsp>Try-Again</a>");	
			out.println("<h3><a href=index.jsp>Home</a><br>");
		}else{
			//send a mail containing the password
			out.println("<h3>Password Sent To Your Mail Id</h3>");
			out.println("<h3><a href=index.jsp>Home</a><br>");
			com.ssi.util.MailUtil.send(useremail, "Your Password Recovery",  "Your Account Password Is : "+password);
			
		}
		
		out.println("</body></html>");
	}

}
