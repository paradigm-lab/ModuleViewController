<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <style>

    </style>
</head>
<body>

    <h1 align="center" >Payment</h1>
    <hr />

<form action="bill-successfully" method="GET">
    <div align = "center">
        <label>Card Number:</label>
        <input type="text" />
        <br />
        <br />

        <label>Amount: </label>
        <input type="text" />
        <br />
        <br />

        <input type="submit" value="pay"/>
    </div>
</form>

</body>
</html>
