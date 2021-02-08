<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h3>Dear Employee, I'm glad to see you!</h3>

<%--<h1>Your name: ${param.employeeName}</h1>--%>

<p><b><i>Your name: </i></b>${employee.name}</p>
<p><b><i>Your surname: </i></b>${employee.surName}</p>
<p><b><i>Your salary: </i></b>${employee.salary}</p>
<p><b><i>Your department: </i></b>${employee.department}</p>
<p><b><i>Your car: </i></b>${employee.carBrand}</p>
<p><b><i>Language(es): </i></b></p>
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
<br>
<a href="${pageContext.request.contextPath}/employee/">To the main page</a>
</body>

</html>