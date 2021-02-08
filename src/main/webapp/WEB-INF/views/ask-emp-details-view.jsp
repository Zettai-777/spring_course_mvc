<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h3>Dear Employee, please enter your details below:</h3>

<form:form action="showDetails" modelAttribute="employee">

    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surName"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
                <%--  HardCoded option  --%>
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>

    <%--       Map value and label options         --%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want?
<%--        HardCoded Radio-button        --%>
<%--    BMV<form:radiobutton path="carBrand" value="BMV"/>--%>
<%--    Audi<form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    Lada<form:radiobutton path="carBrand" value="Lada"/>--%>

    <%--       Map value and label radio-buttons         --%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    Foreign language(es):
<%--        HardCoded check-box         --%>
<%--    EN<form:checkbox path="languages" value="English"/>--%>
<%--    DE<form:checkbox path="languages" value="Deutch"/>--%>
<%--    RU<form:checkbox path="languages" value="Russian"/>--%>
<%--    JP<form:checkbox path="languages" value="Japan"/>--%>

    <%--       Map value and label check-boxes         --%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>


</body>

</html>