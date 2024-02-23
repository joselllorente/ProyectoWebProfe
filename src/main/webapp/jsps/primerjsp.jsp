<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List, java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
    html, body {
      height: 100%;
      margin: 0;
      padding: 0;
    }

    body {
      display: flex;
      flex-direction: column;
    }

    .contenedor-padre {
      flex: 1;
      background-color: lightgray;
    }

    .mi-div {
      height: 50%; /* Puedes ajustar este porcentaje según tus necesidades */
      background-color: teal;
    }
  </style>
</head>
<body>
	<jsp:include page="cabecera.html"></jsp:include>
	<div class="container">
		<!-- CABECERA -->
		<div class="row align-items-center">
			<div class="col-12 mi-div">
				<%
				int numero = Integer.parseInt(request.getParameter("numero"));
				for (int i = 0; i < numero; i++) {
				%>
				<p>
					Esto es una prueba de jsp<%=numero%></p>
				<%
				}
				%>

				<ol>
					<%
					List<String> colores = new ArrayList();
					colores.add("Rojo");
					colores.add("Azul");
					colores.add("Amarillo");
					colores.add("Verde");
					for (String color : colores) {
					%>
					<li><%=color%></li>
					<%
					}
					%>
				</ol>
			</div>
		</div>
	</div>


	<!-- <ol> -->
	<!-- 	<li>Rojo</li> -->
	<!-- 	<li>Azul</li> -->
	<!-- 	<li>Amarillo</li> -->
	<!-- 	<li>Verde</li> -->
	<!-- </ol> -->

	<jsp:include page="piepagina.html"></jsp:include>
</body>
</html>