<%@include file="info.jsp" %>
<html>
<body>
<h2>Online-Assignment-Portal</h2>
<form action="VerifyUser">
<table border="0">
<tr>
	<td>Userid</td><td><input type="text" name="id"/></td>
</tr>
<tr>
	<td>Password</td><td><input type="password" name="pw"/></td>
</tr>
<tr>	
	<td>UserType</td><td><select name="utype">
					<option>Admin</option>
					<option>Faculty</option>
					<option>Student</option>
				</select></td>
</tr>
<tr>				
				<td></td><td><input type="submit" value="Login"/></td>
</tr>				
</table>
</form>
<hr>
<a href="registration.jsp">New-Student-Registration</a><br>
<a href="recoverpassword.jsp">Forget-Password</a><br>
<a href="checkstatus.jsp">Check-Account-Status</a>
</body>
</html>
