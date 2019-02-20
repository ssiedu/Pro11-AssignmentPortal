<html>
<body>

<h3>Assignment Upload Form</h3>
<form action="SaveAssignment" method="post">
	<pre>
	ACode		<input type="text" name="acode"/>	
	Question	<input type="text" name="que"/>
	Subject		<select name="subject">
				<option>Java</option>
				<option>SQL</option>
				<option>Python</option>
				<option>Hibernate</option>
				<option>Spring</option>
				</select>
	FCode		<input type="text" name="fcode"/>
				<input type="submit" value="Upload"/>
	</pre>
	<hr>
	<a href="facultyhome.jsp">Faculty-Home</a>
</form>
</body>
</html>