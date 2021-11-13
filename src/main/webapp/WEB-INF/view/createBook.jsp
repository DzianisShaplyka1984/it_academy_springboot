<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring_form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<c:url value="/createBook"/>" >
    <label>Title:</label> <input type="text" name="title"><br>
    <label>Year:</label> <input type="text" name="year"><br>
    <input type="submit" value="Submit">
</form>

<c:url value="/createBook" var="myVar"/>

<spring_form:form action="${myVar}" method="post" modelAttribute="book">
    <spring_form:label path="title">Title:</spring_form:label> <spring_form:input type="text" path="title"/><br>
    <spring_form:label path="year">Year:</spring_form:label> <spring_form:input type="text" path="year"/><br>
    <input type="submit" value="Submit">
</spring_form:form>


</body>
</html>
