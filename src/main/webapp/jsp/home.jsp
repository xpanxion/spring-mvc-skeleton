<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home Page</title>
</head>
<body>
<h1>Under Construction!!!</h1>
<table>
<c:forEach var="entity" items="${test}">
<tr><td>${entity.id }</td><td>${entity.text }</td></tr>
</c:forEach>
</table>
</body>
</html>