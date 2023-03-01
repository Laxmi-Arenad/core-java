<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script

	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body  style="color:blue">
<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				
                    src=  https://www.mistay.in/travel-blog/content/images/2020/08/Melbourne.jpg
				alt="" width="85" height="50" class="d-inline-block align text-top">
			</a> 
			<a href="index.jsp">Home</a>
		</div>
	</nav>
	
<h3>Welcome to Stadium success</h3>
<h4>
<span style="color: red;">${message }
</span>
</h4>

<form action="searchbygames" method="get">
<pre>
Search By games<input type="text" name="games"/>
            <input type="submit" value="Search" class="btn btn-secondary"/>
</pre>
</form>
<div>

<table class="table">
<tr>
<th scope="col">ID</th>
<th scope="col">Games</th>
<th scope="col">Name</th>
<th scope="col">City</th>
<th scope="col">State</th>
<th scope="col">Tracklength</th>
<th scope="col">Edit</th>
</tr>
<c:forEach items="${list}" var="s">

<tr>
<td>${s.id}</td>
<td>${s.games}</td>
<td>${s.name}</td>
<td>${s.city}</td>
<td>${s.state}</td>
<td>${s.tracklength}</td>
<td><a href="update?id=${s.id }">Edit</a> </td>
</tr>
</c:forEach>
</table>

</div>
</body>
</html>