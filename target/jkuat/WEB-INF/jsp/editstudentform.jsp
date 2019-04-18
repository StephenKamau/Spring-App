<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Stephen K
  Date: 25/03/2019
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <title>Edit Student Information</title>
</head>
<body>
<nav class="nav navbar-dark bg-dark justify-content-center">
    <h1 class="h2 text-light text-center font-weight-light">Edit Student</h1>
</nav>
<div class="container pt-2">
    <form:form action="/editsave" method="post">
        <form:hidden path="id"/>
        <div class="form-group">
            <label for="firstN">First Name</label>
            <form:input path="firstName" id="firstN" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="lastN">Last Name</label>
            <form:input path="lastName" id="lastN" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="yearOfStudy">Year Of Study</label>
            <form:input path="yearOfStudy" id="yearOfStudy" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="semesterOfStudy">Semester Of Study</label>
            <form:input path="semesterOfStudy" id="semesterOfStudy" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="programOfStudy">Program Of Study</label>
            <form:input path="programOfStudy" id="programOfStudy" cssClass="form-control"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>
