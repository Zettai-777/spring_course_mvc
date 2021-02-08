<!DOCTYPE html>

<html>

<body>

<h1>Dear Employee, I'm glad to see you!</h1>

<%--<h1>Your name: ${param.employeeName}</h1>--%>

<i>Your name:</i><h3>${employee.name}</h3>
<i>Your surname:</i><h3> ${employee.surName}</h3>
<i>Your salary:</i><h3> ${employee.salary}</h3><br>

<br>
<a href="${pageContext.request.contextPath}/employee/">To the main page</a>
</body>

</html>