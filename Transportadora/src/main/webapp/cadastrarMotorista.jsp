<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<title>Cadastrar Motorista</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">Transp</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="#">Inicio</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="cadastrarMotorista.jsp">CadastrarMotorista</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="verMotorista.jsp">VerMotorista</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<section class="d-flex justify-content-center mt-5">
         <form  method="post" action="cadastrarMotorista">
            <div class="form-group">
                <label>Nome</label>
                <input type="text" class="form-control" name="nome" placeholder="Nome do Motorista">
            </div>
            <br>
             <div class="form-group">
                <label>Cpf</label>
                <input type="text" class="form-control" name="cpf" placeholder="Cpf do Motorista">
            </div>
            <br>
             <div class="form-group">
                <label>Telefone</label>
                <input type="text" class="form-control" name="telefone" placeholder="Telefone do Motorista">
            </div>
            <br>
             <div class="form-group">
                <label>Endereço</label>
                <input type="text" class="form-control" name="endereco" placeholder="Endereço do Motorista">
            </div>
            <br>
             <div class="form-group">
                <label>Sexo</label>
                <input type="text" class="form-control" name="sexo" placeholder="Sexo">
            </div>
            <br>
            <div class="form-group">
                <label>Data de Nascimento</label>
                <input type="text" id="dtNascimento" class="form-control"  name="dtNascimento" placeholder="Data de nascimento">
            </div>
            <br>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>    
    </section>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>