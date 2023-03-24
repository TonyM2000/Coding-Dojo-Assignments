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
    <title>Omikuji Form</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <!-- This makes the number the enter stored here V -->
    <!-- ${number} -->
    <!-- Making a form below V -->
    <h1>Send an Omikuji!</h1>
    <form action="/handleformdata" method="post">
        <div class = form-group row><input type="text" name="number" placeholder="Number between 0 and 50"></div>
        <div class = form-group row></div><input type="text" name="cityname" placeholder="City Name"></div>
        <div class = form-group row></div><input type="text" name="personname" placeholder="Person"></div>
        <div class = form-group row></div><input type="text" name="hobby" placeholder="Professional Hobby"></div>
        <div class = form-group row></div><input type="text" name="livingthing" placeholder="Animal or plant"></div>
        <div class = form-group row></div><input type="textarea" name="somethingnice" placeholder="Say something nice!"></div>
        <button>submit</button>
    </form>
    <p>Send this to a friend!</p>
</body>
</html>