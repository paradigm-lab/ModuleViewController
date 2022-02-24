<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title></title>
</head>

<body>
    <h1 align="center">Love calculator</h1>
    <hr/>


<h2> The Love Calculator Predicts: </h2>
<br/>
        ${userInfo.userName} and ${userInfo.crushName} are
        <br />

        ${userInfo.result}
        <br />

        <a href = "/sendEmail"> Send Result to Your Email </a>
</body>
</html>