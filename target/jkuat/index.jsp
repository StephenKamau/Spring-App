<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Stephen K
  Date: 07/03/2019
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <title>Students Database</title>
</head>
<body>
<nav class="nav navbar-dark bg-dark justify-content-center">
    <h1 class="display-3 text-light text-center">Students Database</h1>
</nav>
<div class="container pt-5">
    <div class="jumbotron text-center">
        <h1 class="display-3">Manage Records</h1>
        <div class="container pt-2">
            <a href="viewstudents" class="btn btn-primary shadow mr-3">View Students</a>
            <a href="studentform" class="btn btn-danger shadow">Add Students</a>
        </div>
    </div>
</div>
</body>
</html>
