<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./header.jsp"></jsp:include>

	<h1>Usuario nuevo</h1>
	<form>
		Username:<br> <input type="text" name="username" placeholder="username" required><br>
		Password:<br> <input type="password" name="lastname" placeholder="password" required>
	</form>

</body>
</html>