<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html>
<head>
    <title>Home Page</title>

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



    <h1 align="center">Love Calculator</h1>
    <hr/>
<form:form action = "process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
    <div align="center">
        <p>
            <label for="yn">Your Name: &nbsp</label>
            <form:input  id="yn" path = "userName"/>
            <form:errors path="userName" cssClass="errors"/>
        </p>


        <p>
            <label for="cn">Crush Name: </label>
            <form:input id="cn" path = "crushName"/>
        </p>

        <p>
            <form:checkbox path="termAndCondition" id = "check"/>
            <label> I am agreeing that this is for fun</label>
            <form:errors path="termAndCondition" cssClass="errors"/>
        </p>

        <input type="submit" value="calculate" />
    </div>
</form:form>

<script type="text/javascript">

    function validateUserName() {
        var userName = document.getElementById("yn").value;
        if (userName.length < 3) {
            alert("You name should have at least one character");
            return false;
        } else {
            return true;
        }
    }

</script>

</body>
</html>