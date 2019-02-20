package com.ssi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChangeStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid=request.getParameter("userid");
		String status=request.getParameter("status");
		
		String hql="update Student set status=:s where email=:e";
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Query qr=session.createQuery(hql);
		qr.setParameter("s", status);
		qr.setParameter("e", userid);
		qr.executeUpdate();
		tr.commit();
		session.close();
		response.sendRedirect("ShowAppliedStudentAccounts");
		
		
	}

}
