<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>Emergencia COVID-19</title>
<link rel="stylesheet" href="Estilos/index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	>
</head>

<body class="Inicio">
	<div class="Inicio2">
		<img src="Imagenes/Logo_GobiernoSV.png" alt="GobiernoDeElSalvador"
			class="LogoGobiernoSV">
	</div>
	<br>
	<br>
	<br>
	<p class="Informacion1">
		<strong> Consulta quién de tú familia es beneficiario del
			apoyo <br>económico para alimentación en la emergencia
		</strong>
	</p>
	<p class="covid">
		<strong> COVID-19 </strong>
	</p>
	<br>
	<br>
	<form action="ControllerMostrarBeneficiario" method="post">
		<input type="text" name="dui"
			placeholder="Ingresa tú número de DUI"><input type="submit" value="CONSULTAR"
			class="consultar">
	</form>
	<br>
	<br>
	<br>
	<p class="Informacion2">
		<strong> El apoyo económico brindado por el Gobierno de El
			Salvador está dirigido a personas afectadas por la pandemia COVID-19.
			Dicho beneficio <br>corresponde a $300.00 por vivienda.
		</strong>
	</p>
</body>

</html>