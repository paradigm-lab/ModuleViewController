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

    <br/>

    <label>Country: </label>
    <form:select path="countryName">
        <form:option value="Ind" label="India"></form:option>
        <form:option value="Usa" label="United States"></form:option>
        <form:option value="Tz" label="Tanzania"></form:option>
        <form:option value="Sa" label="South Africa"></form:option>
    </form:select>

    <br/>

    <label>Hobbies: </label>
     <form:checkbox path="hobbies" value="cricket" /> Cricket
     <form:checkbox path="hobbies" value="Reading" /> Reading
     <form:checkbox path="hobbies" value="travel" /> Travel
     <form:checkbox path="hobbies" value="programming" /> Programming

    <br/>

    <label>Gender: </label>
    <form:radiobutton path="gender" value="male" /> Male
    <form:radiobutton path="gender" value="female" /> Female

    </form:form>

    <br/>

    <input type="submit" value="register">

</body>
</html>