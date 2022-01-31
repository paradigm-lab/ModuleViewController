<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1 align="center"> Please register here </h1>

    <form:form modelAttribute="userReg">

    <label>User: </label>
    <form:input path="name" />

    <br/>

    <label>User Name: </label>
    <form:input path="userName" />

    <br/>

    <label>Password: </label>
    <form:password path="password" />

    </form:form>

</body>
</html>