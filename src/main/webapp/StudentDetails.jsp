<jsp:useBean scope="session" id="data" class="com.ssi.entities.Student"/>
<html>
<body>
	<h3>Student-Details</h3>
	<hr>
	<table border="2">
		<tr>
			<td>Email</td>
			<td><jsp:getProperty name="data" property="email"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><jsp:getProperty name="data" property="sname"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><jsp:getProperty name="data" property="address"/></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><jsp:getProperty name="data" property="mobile"/></td>
		</tr>
		<tr>
			<td>Status</td>
			<td><jsp:getProperty name="data" property="status"/></td>
		</tr>
	</table>
	<hr>
	<a href="studentsearch.jsp">Search-More</a><br>
	<a href="adminhome.jsp">Admin-Home</a><br>
</body>
</html>