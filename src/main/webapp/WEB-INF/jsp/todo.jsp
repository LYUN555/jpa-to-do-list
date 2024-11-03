<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>	
<meta charset="UTF-8">
<title>Add Todos Page</title>
</head>
<body>
	<div class="container">
		<h1>Enter Todo Details</h1>
		<form:form method="post" modelAttribute="todo">
			Description: <form:input type="text" path="description" required="required"/>
							<form:errors path="description" cssClass="text-warning"/>
							<form:input type="hidden" path="id"/>
							<form:input type="hidden" path="done"/>
			<input type="submit" class="btn btn-success">
		</form:form>
	</div>
</body>
</html>