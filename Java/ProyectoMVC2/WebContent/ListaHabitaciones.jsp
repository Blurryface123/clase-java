<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Usuarios</title>
<link href="" rel="">
</head>
<body>
	<h1>Lista Habitaciones</h1>
	<ul>
		<c:forEach var="unaHabitacion" items="${unaHabitacion}">  
		<li>
		<a href="./habitacion?id=${unaHabitacion.hid}">
		<div>HID:${unaHabitacion.hid}</div>
		<div>Calle:${unaHabitacion.calle}</div>
		<div>M2:${unaHabitacion.m2}</div>
		</a>
		
		
		</li>
		</c:forEach>
  
	</ul>
</body>
</html>