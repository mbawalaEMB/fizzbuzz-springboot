<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Fizz Buzz !</h3>
	<form action="/fizzbuzz">
		<input type="number" name="num" placeholder="Enter Number" min="1" required="required">
		<input type="submit" value="Send">	
	</form>
	
	<br>
</body>
</html>