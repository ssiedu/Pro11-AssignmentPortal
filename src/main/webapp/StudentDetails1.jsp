<%@page import="com.ssi.entities.Student"%>
<%
	Student s=(Student)session.getAttribute("data");
%>
<html>
<body>
	<h3>Student-Details</h3>
	<hr>
	<table border="2">
		<tr>
			<td>Email</td>
			<td><%=s.getEmail() %></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><%=s.getSname() %></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><%=s.getAddress()%></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><%=s.getMobile() %></td>
		</tr>
		<tr>
			<td>Status</td>
			<td><%=s.getStatus() %></td>
		</tr>
	</table>
	<hr>
	<a href="studentsearch.jsp">Search-More</a><br>
	<a href="adminhome.jsp">Admin-Home</a><br>
</body>
</html>