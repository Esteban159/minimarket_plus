<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 30/06/2015
  Time: 05:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head lang="es">
  <title>PÁGINA DE REGISTRO</title>
  <meta charset="utf-8">
  <spring:url value="/resources/css/estilos.css" var="Css" />
  <spring:url value="/resources/css/bootstrap.min.css" var="boots" />
  <link rel="stylesheet" type="text/css" href="${boots}"/>
  <link rel="stylesheet" type="text/css" href="${Css}"/>
</head>
<body>
<header class="col-md-12" id="header21">
  <div class="container-fluid">
    <div class="row">
      <div class="cold-md-12" id="header22">
        REGÍSTRATE
      </div>
    </div>
  </div>
</header>
<section class="col-md-12">
  <div class="well container col-md-8 col-md-offset-2 header23">
    <div class="row" >
      <div class="col-md-12 ">
        <form class="form-horizontal" method="get" action="registrando">
          <div class="form-group">
            <label  class="col-md-2 control-label">NOMBRES:</label>
            <div class="col-md-7">
              <input type="text" name="nombre" class="form-control"  placeholder="NOMBRES" required/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">APELLIDOS</label>
            <div class="col-md-7">
              <input type="text" name="apellido" class="form-control" placeholder="APELL. PATER." required/>
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-2 control-label">DIRECCIÓN:</label>
            <div class="col-md-7">

              <input type="text" name="direccionMinimarket" class="form-control"  placeholder="DIRECCIÓN" required/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">NEGOCIO:</label>
            <div class="col-md-7">
              <input type="text" class="form-control" name="nombreMinimarket" placeholder="NOMBRE DEL MINIMARKET" required/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">TELÉFONO:</label>
            <div class="col-md-7">
              <input pattern="[0-9]{7}" class="form-control"  name="telefono" placeholder="TELÉFONO"/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">EMAIL:</label>
            <div class="col-md-7">
              <input type="email" class="form-control" name="email" placeholder="Ejemplo@example.com" required/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">CONTRASEÑA:</label>
            <div class="col-md-7">
              <input type="password" class="form-control" name="contrasenha" placeholder="Contraseña" required/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">RUC:</label>
            <div class="col-md-7">
              <input type="number" class="form-control"  placeholder="RUC"/>
            </div>
          </div>
          <div class="form-group">
            <label  class="col-md-2 control-label">CUI:</label>
            <div class="col-md-7">
              <input pattern="[0-9]{8}" class="form-control"  name="cui" placeholder="CUI" required/>
            </div>
          </div>
          <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
              <button type="button" class="btn btn-danger">TÉRMINOS Y CONDICIONES</button>
            </div>
          </div>

          <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
              <div class="checkbox">
                <label>
                  <input type="checkbox" required/> Acepto los términos y condiciones
                </label>
              </div>
            </div>
          </div>

          <div class="form-group">
            <div class="col-md-offset-2 col-md-10">
              <button type="submit" class="btn btn-primary" >CREAR NUEVA CUENTA</button>
            </div>
          </div>
        </form>
      </div>

    </div>

  </div>
</section>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>