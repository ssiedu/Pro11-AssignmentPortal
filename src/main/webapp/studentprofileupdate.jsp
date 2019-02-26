<%@page import="com.ssi.dao.StudentDAO, com.ssi.entities.Student"%>
<%
	String id=(String)session.getAttribute("user");
	StudentDAO dao=new StudentDAO();
	Student student=dao.searchById(id);
	String password=student.getPassword();
	String email=student.getEmail();
	String address=student.getAddress();
	String mobile=student.getMobile();
%>

<html>
<body>
<h3>Student-Profile-Update</h3>
<hr>
	<form action="UpdateProfile">
	<pre>
		Email	<input type="text" name="email" value=<%=email%>>
		Password<input type="password" name="password" value=<%=password%>>
		Address	<input type="text" name="address" value=<%=address%>>
		Mobile	<input type="text" name="mobile" value=<%=mobile%>>
			<input type="submit" value="Update"/>
 	</pre>
	</form>
<hr>
<a href="studenthome.jsp">Student-Home</a>
</body>
</html>