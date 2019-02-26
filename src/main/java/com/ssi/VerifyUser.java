package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.ssi.dao.StudentDAO;
import com.ssi.entities.Faculty;
import com.ssi.entities.Student;

/**
 * Servlet implementation class VerifyUser
 */
public class VerifyUser extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	
    	HttpSession session=request.getSession();
    	
    	PrintWriter out=response.getWriter();
    	
    	String s1=request.getParameter("id");
    	String s2=request.getParameter("pw");
    	String s3=request.getParameter("utype");

    	if(s3.equals("Admin")){
    		if(s1.equals("admin") && s2.equals("indore")){
    			response.sendRedirect("adminhome.jsp");
    		}else{
    			out.println("Invalid Admin Account");
    		}
    	}else if(s3.equals("Faculty")){

    		
    		Session ses=Data.getSF().openSession();
    		Faculty f=ses.get(Faculty.class, s1);
    		
    		if(f==null){
    			out.println("Invalid Faculty Code");
    		}else{
    			String p=f.getPassword();
    			if(s2.equals(p)){
    				session.setAttribute("user", s1);
    				response.sendRedirect("facultyhome.jsp");
    			}else{
    				out.println("wrong password");
    			}
    		}
    
    	}else if(s3.equals("Student")){
    		//Session session=Data.getSF().openSession();
    		//Student st=session.get(Student.class, s1);
    		
    		StudentDAO dao=new StudentDAO();
    		Student st=dao.searchById(s1);
    		
    		if(st==null){
    			out.println("Invalid Student Id");
    		}else{
    			String status=st.getStatus();
    			if(status.equals("activated")){
    			
    			
    			String p=st.getPassword();
    			if(s2.equals(p)){
    				session.setAttribute("user", s1);
    				response.sendRedirect("studenthome.jsp");
    			}else{
    				out.println("wrong password");
    			}
    			}else{
    				out.println("your account is not activated yet. please wait.");
    		}}
    		
    	}
    	
    	
	}

}
