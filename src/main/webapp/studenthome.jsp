<%@include file="info.jsp" %>
<html>
<body>
<h3>Welcome Student <%=session.getAttribute("user") %></h3>
<hr>
	<a href="studentprofileupdate.jsp">Update-Profile</a><br>
	<a href="facultysearch.jsp">Search-Faculty-By-Code</a><br>
	<a href="AllAssignmentServlet">View-All-Assignment</a><br>
	<a href="">Subject-Wise-Assignment</a><br>
	<a href="index.jsp">Logout</a><br>
<hr>
</body>
</html>