<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Burger</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <form:form action="/burgers/${burger.id}" method="POST" modelAttribute="burger">
        <input type="hidden" name="_method" value="PUT">
    <form:label path="burgername">Burger Name:</form:label>
    <form:errors path="burgername"></form:errors>
    <form:input path="burgername"></form:input>

    <form:label path="restaurantname">Restaurant Name:</form:label>
    <form:errors path="restaurantname"></form:errors>
    <form:input path="restaurantname"></form:input>

    <form:label path="rating">Rating:</form:label>
    <form:errors path="rating"></form:errors>
    <form:input path="rating"></form:input>

    <form:label path="notes">Notes:</form:label>
    <form:errors path="notes"></form:errors>
    <form:input path="notes"></form:input>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>