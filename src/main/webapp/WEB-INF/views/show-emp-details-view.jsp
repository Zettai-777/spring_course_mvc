<!DOCTYPE html>

<html>

<body>

<h2>Dear Employee, I'm glad to see you!</h2>
<br>
<br>

<%--<h1>Your name: ${param.employeeName}</h1>--%>

<h1>Your name: ${fullNameAttribute}, ${ageEmpAttribute} years old.</h1>

<br>
<a href="${pageContext.request.contextPath}/">To the main page</a>
</body>

</html>