<%@page import="com.ssi.entities.Faculty" %>
<%@page import="com.ssi.Data"%>
<%@page import="org.hibernate.*" %>
<%
	String code=request.getParameter("code");
	Session hsession=Data.getSF().openSession();
	Faculty faculty=hsession.get(Faculty.class, code);
	String fcode=faculty.getFcode();
	String fname=faculty.getFname();
	String qulf=faculty.getQualification();
	String address=faculty.getAddress();
	String mobile=faculty.getMobile();
	String email=faculty.getEmail();
%>
<html>
	<body>
		<h3>Faculty-Details</h3>
		<table border="2">
			<tr>
				<td>FCode</td>
				<td><%=fcode%></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><%=fname%></td>
			</tr>
			<tr>
				<td>Qualification</td>
				<td><%=qulf%></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><%=address%></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><%=mobile%></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><%=email%></td>
			</tr>
		</table>
		<a href=studenthome.jsp>Student-Home</a>
	</body>
</html>
<%
	hsession.close();
%>
