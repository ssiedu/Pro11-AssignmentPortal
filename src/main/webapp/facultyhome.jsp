<%@include file="info.jsp" %>
<html>
<body>
<h3>Welcome Faculty <%=session.getAttribute("user")%></h3>
<hr>
	<a href="uploadassignment.jsp">Upload-Assignment</a><br>
	<a href="ShowFacultyAssignments">View-My-Assignments</a><br>
	<a href="">Modify Assignment</a><br>
	<a href="index.jsp">Logout</a><br>
<hr>
</body>
</html>