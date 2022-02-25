<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content Type" content="text/html; charset=UTF-8">
    <title> Insert title here </title>


    <style type="text/css">
        .errors{
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 30px;
        }
    </style>

</head>

<body>

<h1> Hi ${userInfo.userName}</h1>
<h2> Send Result To Your Email </h2>

<form:form action="process-email" method="GET" modelAttribute="emailDTO">

    <label> Enter your Email </label>
    <form:input path="userEmail" />
    <form:errors path = "userEmail" cssClass = "errors" />
    <input type="submit" value="send" />

</form:form>

</body>
</html>