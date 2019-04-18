<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>View Students</title>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>

<nav class="nav navbar-dark bg-dark justify-content-center">
    <h1 class="h2 font-weight-light text-light text-center">View Students</h1>
</nav>

<div class="container mt-2">
    <ul class="nav nav-pills">
        <li class="nav-item">
            <a class="nav-link active" href="studentform">Add Student</a>
        </li>
    </ul>
</div>

<div class="container p-2">
<table class="table table-sm table-striped table-bordered">
    <tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Year of Study</th><th>Semester of Study</th><th>Program of Study</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${listStudents}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.firstName}</td>
            <td>${emp.lastName}</td>
            <td>${emp.yearOfStudy}</td>
            <td>${emp.semesterOfStudy}</td>
            <td>${emp.programOfStudy}</td>
            <td><a class="btn-outline-secondary" href="editstudent/${emp.id}">Edit</a></td>
            <td><a class="btn-outline-danger" href="deletestudent/${emp.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</div>
</html>