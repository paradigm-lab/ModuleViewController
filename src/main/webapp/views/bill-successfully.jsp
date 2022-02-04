<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Bill Successfully</title>
</head>
<body>

    <h1>Payment Successfully</h1>
    <h2>The detail entered by you are:</h2>

    Credit Card: ${userBill.card}
    Amount: ${userBill.amount}

</body>
</html>