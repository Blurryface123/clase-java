<%@page import="com.ricardo.modelos.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Usuarios</title>
<link href="./CSS/styles.css" rel="stylesheet">
</head>
<body>

	<header>
		<div>Lista de Habitaciones</div>
		<nav>
			<ul>
				<li>Habitaciones</li>
				<li><a href="./logout">Salir</a></li>
			</ul>
		</nav>
		<a href="./logout">Salir</a>
	</header>


	<h1>DAtos de usuarios</h1>
	<ul>
		<c:forEach var="unUsuario" items="${losUsuarios}">
			<li><a href="./usuario?id=${unUsuario.id}">
					<div>${unUsuario.id}</div>
					<div>${unUsuario.name}</div>
					<div>${unUsuario.email}</div>
			</a></li>
		</c:forEach>
		<button id="volverBtn">Volver</button>
	</ul>
</body>
<script src="./js/script.js"></script>
</html>