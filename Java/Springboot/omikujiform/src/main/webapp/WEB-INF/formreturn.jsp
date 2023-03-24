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
    <title>Omikuji</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Omikuji</h1>
<div class="card border-primary mb-3" style="width: 18rem;">
    <div class="card-body">
    <h5 class="card-title">Here's Your Omikuji</h5>
    <h6 class="card-subtitle mb-2 text-muted"></h6>
    <p class="card-text">In ${number} years you will live in ${cityname} with ${personname} as your roommate, selling
    ${hobby} for a living. The next time you see a ${livingthing} you will have good luck. Also, ${somethingnice} .
    </p>
    <a href="/" class="card-link">Go Back</a>
    <a href="#" class="card-link"></a>
    </div>
</div>
<!-- USE ALT SHIFT DOWN to copy quickly -->
</body>
</html>