<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30/06/2015
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <title>MINIMARKET PLUS</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/estilos.css">
</head>
<body>
<header class="col-md-12" id="header1">
  <div class="container-fluid" id="header2">
    <div class="row" id="header5">
      <div class="col-md-8">
        <div class="container col-md-12 header7">
          MINIMARKET-PLUS
        </div>
      </div>
      <div class="col-md-4 header6">
        <form class="form-horizontal" method="get">
          <div class="form-group">
            <label for="inputEmail3" class="col-md-2 control-label">USUARIO</label>
            <div class="col-md-7 col-md-push-1">
              <input type="email" class="form-control header3" id="inputEmail3" placeholder="USUARIO" required autofocus/>
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword3" class="col-md-2 control-label">CONTRASEÑA</label>
            <div class="col-md-7 col-md-push-1">
              <input type="password" class="form-control header3" id="inputPassword3" placeholder="........" required />
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
              <div class="checkbox">
                <label>
                  <input type="checkbox"> Recordar Cuenta
                </label>
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
              <a href="vistas/pruebaatencion.html">
                <button type="submit" class="btn btn-primary">
                  <a href="vistas/prueba.html" id="head">ENTRAR </a>
                </button>
              </a>
              <button type="button"  class="btn btn-success" >
                <a href="/hola" id="header8">REGISTRARSE</a>
              </button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</header>
<section class="col-md-12">
  <div class="container col-md-12">
    <div class="row">
      <div class="col-md-12">
        <img  src="img/portada.jpg" class="col-md-10 col-md-push-1" id="imagen"/>
      </div>
    </div>
  </div>
</section>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>
