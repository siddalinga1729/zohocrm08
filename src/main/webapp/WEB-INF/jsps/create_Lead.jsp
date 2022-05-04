<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
<h3>Create | Lead</h3>
<form action="savelead" method="post">
<pre>
FirstName:<input type="text" name="firstName"><!-- name should match class variables -->
LastName:<input type="text" name="lastName">
Email:<input type="text" name="email">
leadSource:
		<select name="leadSource" >
		  <option value="TV">TV</option>
		  <option value="Online">Online</option>
		  <option value="News Paper">News Paper</option>
		  <option value="Friends">Friends</option>
		</select>
Mobile:<input type="text" name="mobile">
<input type="submit" value="Save">

</pre></form>
</body>
</html>