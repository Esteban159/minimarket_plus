<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <form class="form-horizontal" action="nuevousuario" method="post">
                    <div class="form-group">
                        <label  class="col-md-2 control-label">NOMBRES:</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" id="nombres" placeholder="NOMBRES" required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">APELLIDOS</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" id="apellidos" placeholder="APELL. PATER." required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">DIRECCIÓN:</label>
                        <div class="col-md-7">

                            <input type="text" class="form-control" id="direccion" placeholder="DIRECCIÓN" required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">NEGOCIO:</label>
                        <div class="col-md-7">
                            <input type="text" class="form-control" id="negocio" placeholder="NOMBRE DEL MINIMARKET" required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">TELÉFONO:</label>
                        <div class="col-md-7">

                            <input pattern="[0-9]{7}"class="form-control" id="telefono" placeholder="TELÉFONO">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">EMAIL:</label>
                        <div class="col-md-7">
                            <input type="email" class="form-control" id="email" placeholder="Ejemplo@example.com" required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-md-2 control-label">RUC:</label>
                        <div class="col-md-7">
                            <input type="number" class="form-control" id="ruc" placeholder="RUC"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-2 control-label">CUI:</label>
                        <div class="col-md-7">
                            <input pattern="[0-9]{8}" class="form-control" id="cui" placeholder="CUI" required/>
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
                </form>
            </div>

        </div>

</div>
</section>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>