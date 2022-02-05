<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style>

    </style>
</head>
<body>

    <h1 align="center" >Bill Payment</h1>
    <hr />

<form:form action="bill-successfully" method="get" modelAttribute="userBill">
    <div align = "center">
        <label>Card Number:</label>
        <form:input type="text" path="card"/>
        <br />
        <br />

        <label>Amount: </label>
        <form:input type="text" path="amount"/>
        <br />
        <br />

        <input type="submit" value="Payment"/>
    </div>
</form:form>

</body>
</html>
