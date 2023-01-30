

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>Send Details</h1>
<form action="information" method="post">
<pre>

FirstName<input type="text" name="fName"/>
LastName<input type="text" name="lname"/>
Gender male<input type="radio" name="gender" value="male"/>
      female<input type="radio" name="gender" value="female"/>
      Others<input type="radio" name="gender" value="Others"/>
 Reason  <textarea rows="10"  cols="20" name="reason"></textarea>
 Address <textarea rows="15"  cols="25" name="address"></textarea>
 
 <input type="submit" value="send"/>
</pre>

</form>
</body>
</html>