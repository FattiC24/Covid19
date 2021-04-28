<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>COVID-19</title>
<link rel="stylesheet" href="Estilos/Beneficiarios.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
>
</head>
<body class="Inicio1">
	<%
	HttpSession sesion = (HttpSession) request.getSession();
	String usuSession = String.valueOf(sesion.getAttribute("beneficiario"));
	System.out.println("Beneficiario: " + usuSession);

	if (usuSession.equals(null) || usuSession.equals("null")) {
		response.sendRedirect("index.jsp");
	}
	%>
	<div class="Inicio2">
		<img src="Imagenes/Logo_GobiernoSV.png" alt="GobiernoDeElSalvador"
			class="LogoGobiernoSV">
	</div>
	<br>
	<p class="Introduccion">
		<strong> Eres beneficiario del apoyo
			económico brindado por el Gobierno de El salvador de $300.00 para alimentación de tú hogar.
		<strong>Tú pago podrá ser retirado en cualquiera de las sucursales aprobadas por el Gobierno.
		</strong>
	</p>
	<br>
	<form action="ControllerMostrarBeneficiario" method="post">
		<input type="submit" name="soybeneficiario" value="Volver a consultar"
			class="regresar">
	</form>
</body>
</html>