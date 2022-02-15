<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Bill Successfully</title>
</head>
<body>

    <h1>Payment Successfully</h1>
    <h2>The detail entered by you are:</h2>

    Bill against the credit card number: <span style="color: blue;">${userBill.card} </span>
    Towards amount:
    <span style="color:blue;">
        ${userBill.amount} ${userBill.currency.displayName}
    </span>
    Generated date (on): <span style="color: blue;"> ${userBill.date} </span>
    <br />
</body>
</html>