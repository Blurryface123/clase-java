<%@page import="com.ricardo.modelos.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Usuario elUsuario = (Usuario)request.getAttribute("elUsuario");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuario</title>
</head>
<body>

	<jsp:include page="./header.jsp"></jsp:include>

	<h1>Datos de Usuario</h1>
	<ul>
		<li>ID:${elUsuario.id}</li>
		<li>Nombre:${elUsuario.name}</li>
		<li>Email:${elUsuario.email}</li>
		<li>NºHab:<a href="./habitacion">${elUsuario.habitacion.hid}</a></li>
		
	</ul>
</body>
</html>