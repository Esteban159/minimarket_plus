<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="es">
    <title>PÁGINA DE REGISTRO</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/estilos.css">
    <script type="text/javascript" src="js/verifica_registro.js"></script>
    <script type="text/javascript" src="js/core.js"></script>
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
                <c:form class="form-horizontal" action="registrar" method="post" >
                    <div class="form-group">
                        <label  class="col-md-2 control-label">NOMBRES:</label>
                        <div class="col-md-7">
                            <c:input path="nombre" type="text" class="form-control" id="nombres" placeholder="NOMBRES"/>

                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">DIRECCIÓN:</label>
                        <div class="col-md-7">

                            <c:input path="direccionMinimarket" type="text" class="form-control" id="direccion" placeholder="DIRECCIÓN" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">NEGOCIO:</label>
                        <div class="col-md-7">
                            <c:input path="nombreMinimarket" type="text" class="form-control" id="negocio" placeholder="NOMBRE DEL MINIMARKET"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">TELÉFONO:</label>
                        <div class="col-md-7">

                            <c:input path="telefono" pattern="[0-9]{7}" class="form-control" id="telefono" placeholder="TELÉFONO"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">EMAIL:</label>
                        <div class="col-md-7">
                            <c:input path="email" type="email" class="form-control" id="email" placeholder="Ejemplo@example.com" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">CUI:</label>
                        <div class="col-md-7">
                            <c:input path="cui" pattern="[0-9]{8}" class="form-control" id="cui" placeholder="CUI" />
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
                            <button type="submit" class="btn btn-primary">CREAR NUEVA CUENTA</button>
                        </div>
                    </div>
                </c:form>
            </div>

        </div>

</div>
</section>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>