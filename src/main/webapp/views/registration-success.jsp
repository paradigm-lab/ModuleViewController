<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Registration Successfully</title>
</head>
<body>
    <h1> Your registration is successful </h1>
    <h2> The details entered by you are: </h2>
    Name: ${userReg.name} <br/>
    User Name: ${userReg.userName} <br/>
    Password:

    <c:forEach var="pass" items="${userReg.password}">
        ${pass}
    </c:forEach>
    <br/>

    Country: ${userReg.countryName} <br/>
    Hobbies:
    <c:forEach var="temp" items="${userReg.hobbies}">
        ${temp}
    </c:forEach>
    <br/>

    Gender: ${userReg.gender} <br/>
</body>
</html>
