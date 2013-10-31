<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home Page</title>
</head>
<body>
<h1>Under Construction!!!</h1>
<table>
<c:forEach var="bean" items="${test}">
<tr><td>${bean.id }</td><td>${bean.text }</td></tr>
</c:forEach>
</table>
</body>
</html>