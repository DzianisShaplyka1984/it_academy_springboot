<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${author.id} - ${author.name} <br>

<c:forEach items="${author.books}" var="book">
    ${book.id} - ${book.title} <br>
</c:forEach>

<a href="<c:url value="/authors"/>"> Books</a>
</body>
</html>