<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>

<h1>hey fra JSP!</h1>

<p>${item}</p>

<c:forEach var="item" items="${items}">
    <p>${item.item}</p>
</c:forEach>

</body>
</html>
