<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
<head>

</head>

<body>
    <h1 align="center"> Session Attributes examples </h1>
    <hr />

    First Name: ${firstName}
    <br />

    Last Name: ${lastName}
    <br />

    Address: ${address}
    <br /> <br />

    FIRST NAME VALUE FETCHING FROM THE REQUEST: ${requestScope.firstName}
    <br />

    FIRST NAME VALUE FETCHING FROM THE SESSION: ${sessionScope.firstName}
    <br />

    <a href="${next}"> Next Page is ${next}</a>
</body>
</html>