<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Student List</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Date of Birth</th>
        <th>Gender</th>
        <th>Quota</th>
        <th>Country</th>
        <th>Action</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.dateOfBirth}</td>
            <td>${student.gender}</td>
            <td>${student.quota}</td>
            <td>${student.country}</td>
            <td>
                <a href="/students/${student.id}">Details</a>
                <a href="/students/${student.id}/edit">Edit</a>
                <a href="/students/${student.id}/delete">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="/students/new">Add New Student</a>
</body>
</html>
