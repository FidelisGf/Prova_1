<%@page import="transportadora.dao.MotoristaDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Ver Motorista</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  		<div class="container-fluid">
	   	 		<a class="navbar-brand" href="#">TranspFidelis</a>
	    		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	      			<span class="navbar-toggler-icon"></span>
	    		</button>
	    		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	      			<div class="navbar-nav">
	        		<a class="nav-link active" aria-current="page" href="Menu.jsp">Inicio</a>
	        		<a class="nav-link" href="cadastrarMotorista.jsp">Cadastrar</a>
	        		<a class="nav-link" href="verMotorista.jsp">Ver Motoristas</a>
	      			</div>
	    		</div>
	  		</div>
	</nav>
	<%@ page import="java.util.*, transportadora.dao.MotoristaDAO.*, transportadora.model.Motorista" %>
	<%
		MotoristaDAO motoristaDAO = new MotoristaDAO();
		ArrayList<Motorista> list = motoristaDAO.mostrarMotoristas();
		
	%>
	<table class="table">
	  <thead>
	    <tr>
	     	<th scope="col">ID</th>
	      	<th scope="col">NOME</th>
	      	<th scope="col">CPF</th>
	      	<th scope="col">TELEFONE</th>
	    </tr>
	  </thead>
	  <tbody>
	  <%for(int i = 0; i < list.size(); i++){%>
	  	<tr>
	  		 <th><%=list.get(i).getId()%></th>
	   		 <th><%=list.get(i).getNome()%></th>
	   		 <th><%=list.get(i).getCpf()%></th>
	   		 <th><%=list.get(i).getTelefone()%></th>
	   		 <th>
	   		 	<form action="editarMotorista" method="post"  style="width: 50%; float: left;">
	   		 		<input type="hidden" name="id" value="<%= list.get(i).getId() %>">
	   		 		<input type="submit" value="Editar" style="background: #9a8400; color: white">
	   		 	</form>	
	   		 	<form action="deletarMotorista" method="post"  style="width: 50%; float: right;">
	   		 		<input type="hidden" name="id" value="<%= list.get(i).getId() %>">
	   		 		<input type="submit" value="Deletar" style="background: #9a8400; color: white">
	   		 	</form>	
	   		 </th>
	   	</tr>
	 <%} %>  	
	  </tbody>
	</table>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>