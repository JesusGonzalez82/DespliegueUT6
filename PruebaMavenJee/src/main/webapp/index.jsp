<html lang='es'>
<head>
	<meta charset="UTF-8">
</head>
<body>
<h2><%= "Hola Mundo!!" %></h2>
	<form name="formulario "action="ElSaludador" method="GET">
		<label>Nombre:</label>
			<input type="text" name="nombre"/>
			<input type="submit" name="submit"/>
	</form>
	<ul><li style= "color: #48e;">${saludo}</li></ul>
	<p>Son las <%=java.util.Calendar.getInstance().getTime() %>
</body>
</html>
