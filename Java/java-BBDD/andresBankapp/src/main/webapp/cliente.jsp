<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method=POST>
<h1>LOGIN</h1>
<div><input name="dni" type="text" id="dni" placeholder="Introduce tu DNI" min="9" required value="${dni}"></div>
<div><input name="pin" type="password" id="pin" placeholder="Introduce tu Password" min="9" required value="${pin}"></div>
<button>Log In</button>
</form>

</body>
</html>