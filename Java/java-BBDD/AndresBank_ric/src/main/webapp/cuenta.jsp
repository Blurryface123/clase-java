<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cuenta</h1>

	<div>
		<input type="text" placeholder="cid" id="cid" name="cid"
			value="${Cuenta.cid}" />
	</div>

	<div>
		<input type="text" placeholder="nombre" id="nombre" name="nombre"
			value="${Cuenta.nombre}" />
	</div>

	<div>
		<input type="text" placeholder="numero" id="numero" name="numero"
			value="${Cuenta.numero}" />
	</div>

	<div>
		<input type="text" placeholder="saldo" id="saldo" name="saldo"
			value="${Cuenta.saldo}" />
	</div>
	
</body>
</html>