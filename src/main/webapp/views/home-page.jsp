<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
<head>
    <title>Home Page</title>
</head>
<body>



    <h1 align="center">Love Calculator</h1>
    <hr/>

<form:form action = "process-homepage" method="get" modelAttribute="userInfo" onsubmit="return true">
    <div align="center">
        <p>
            <label for="yn">Your Name: &nbsp</label>
            <form:input  id="yn" path = "userName"/>
        </p>


        <p>
            <label for="cn">Crush Name: </label>
            <form:input id="cn" path = "crushName"/>
        </p>

        <input type="submit" value="calculate" />
    </div>
</form:form>

</body>
</html>