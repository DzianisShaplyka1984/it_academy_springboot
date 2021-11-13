<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

 ${book.id} - ${book.title} - ${book.year} - ${book.author.name} <br><br>

 <a href="<c:url value="/books"/>"> Books</a>
</body>
</html>
