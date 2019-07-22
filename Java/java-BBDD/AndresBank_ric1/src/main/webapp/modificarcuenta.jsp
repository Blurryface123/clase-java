<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Modificar Cuenta</h1>
	
	<div class="error">${mensaje_error}</div>
	<form action="" method="POST">
		<input type="hidden" name="cid" value="${micuenta.cid}" />
		
		<div>
			<input type="text" placeholder="Nombre" name="nombre" minlength="3" value="${micuenta.nombre}"/>
		</div>
		<div>
			<input type="text" placeholder="Número" name="numero" value="${micuenta.numero}"/>
		</div>
		<div>
			<input type="text" placeholder="Saldo" name="saldo" value="${micuenta.saldo}"/>
		</div>
		
		<div>
			<button>Modificar Cuenta</button>
		</div>
	</form>


</body>
</html>