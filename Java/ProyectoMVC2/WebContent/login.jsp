<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	
	<div class=error>${error}</div>
	
	<form action="" method="POST">
		<div>
			<input type="text" placeholder="email" name="email" id="email"
				required />
		</div>
		<div>
			<input type="password" placeholder="password" name="password"
				id="password" required />
		</div>
		<div>
			<button>Entrar</button>
		</div>
	</form>


</body>
</html>