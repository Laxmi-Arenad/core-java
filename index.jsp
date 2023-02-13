<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
 rel="stylesheet" 
 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
  crossorigin="anonymous">
 
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
 integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
  crossorigin="anonymous"></script>
 
</head>
<body  style="color:red">
<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
    src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
    alt="" width="80" height="48" class="d-inline-block align-text-top">
    </a> <a href="Egg.jsp">Egg </a>
		
</div>
</nav>
<h1>Welcome to Egg Application</h1>


	<form action="egg" method="get">
	<pre>
 Hotel Name	<input type="text" name="hotelName"/>
 Egg Dish Name<select  name="dishName"/>
  <option>Select</option>
  <option>Omlet</option>
  <option>Egg_Rice</option>
  <option>Half Boil</option>
  <option>Egg Burge</option>
  <option>Egg Puff</option>
  <option>Egg Masala</option>
  <option>Egg Bonda</option>
  <option>Egg Chilli</option>
  <option>Egg Maggie</option>
  </select>
  Egg Type<select name="type">
  <option>Select </option>
  <option>Nati </option>
  <option>Farm </option> 
  <option>Boiler</option>
  <option>Duck</option>
 <option>Ostrich </option>
 </select>
  Price <input type="text" name="price"/>
  Quantity<select name="quantity">
  <option>Select <option/>
  <option>1 <option/>
  <option>2 <option/> 
  <option>3<option/>
  <option>5<option/>
 <option>10 <option/>
  </select>
  
  
  
Take Away Yes<input type="radio" value="true"  name="takeAway"/>
           No<input type="radio" value="true"  name="takeAway"/>

<input type="submit" value="Order" class="btn btn-primary"/>
</pre>
</form>
</body>
</html>

