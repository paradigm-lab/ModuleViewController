<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>

<body>

<h1>Hello World Page</h1>

<form action="/process-helloworld">
    <label>Your Name: </label>
    <input type="text" name="yn" />
    <input type="submit" />
</form>
</body>
</html>