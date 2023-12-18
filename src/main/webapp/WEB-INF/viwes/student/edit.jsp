<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
<h2>Edit Student</h2>

<form action="<c:url value='/students/${student.id}/edit'/>" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${student.name}" required/><br/>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${student.email}" required/><br/>

    <label for="dateOfBirth">Date of Birth:</label>
    <input type="date" id="dateOfBirth" name="dateOfBirth" value="${student.dateOfBirth}" required/><br/>

    <label for="gender">Gender:</label>
    <select id="gender" name="gender" required>
        <option value="MALE" <c:if test="${student.gender == 'MALE'}">selected</c:if>>MALE</option>
        <option value="FEMALE" <c:if test="${student.gender == 'FEMALE'}">selected</c:if>>FEMALE</option>
    </select><br/>

    <label for="quota">Quota:</label>
    <input type="text" id="quota" name="quota" value="${student.quota}" required/><br/>

    <label for="country">Country:</label>
    <input type="text" id="country" name="country" value="${student.country}" required/><br/>

    <button type="submit">Update</button>
</form>

<a href="<c:url value='/students/${student.id}'/>">Cancel</a>
</body>
</html>

