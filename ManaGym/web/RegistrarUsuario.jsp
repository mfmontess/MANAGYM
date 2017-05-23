<%-- 
    Document   : RegistrarUsuario
    Created on : 18/04/2017, 10:52:36 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>MANAGYM</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <!-- Custom CSS -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />
        <!-- Graph CSS -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- jQuery -->
        <link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
        <!-- lined-icons -->
        <link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
        <!-- //lined-icons -->
        <script src="js/jquery-1.10.2.min.js"></script>
        <!--clock init-->
    </head> 
    <body>
        <!--/login-->
        <div class="error_page">
            <!--/login-top-->
            <script>
            $(document).ready(function() {
                $("input[name$='perfil']").click(function() {
                    var test = $(this).val();
                    $("div.desc").hide();
                    $("#usuario" + test).show();
                });
            });
    </script>
            <div class="error-top">
                <h2 class="inner-tittle page">MANAGYM</h2>
                <div class="login">
                    <h3 class="inner-tittle t-inner">Registrarse</h3>
                    <form action="RegistroUsuarioControlador">
                        <!--<div id="myRadioGroup">-->
                            Instructor<input type="radio" name="perfil" checked="checked" value="2"/>
                            Cliente<input type="radio" name="perfil" value="3"/>
                            <!--<input type="text" name="documento" class="text" placeholder="Documento"  required>
                            <div id="usuario2" class="desc">
                                    <input type="text" name="nombre" class="text" placeholder="Nombre Instructor"  required>
                            </div>
                            <div id="usuario3" class="desc" style="display: none;">
                                <input type="text" name="nombre" class="text" placeholder="Nombre Cliente"  required>
                            </div>
                        </div>-->
                        <input type="date" name="fechaNacimiento" class="text" placeholder="Fecha Nacimiento"  required>
                        <input type="text" name="direccion" class="text" placeholder="Dirección"  required>
                        <input type="text" name="celular" class="text" placeholder="Celular"  required>
                        <input type="text" name="usuario" class="text" placeholder="Codigo Usuario"  required>
                        <input type="password" name="pass"  placeholder="Password"  required>
                        <div class="sign-up">
                            <input type="submit"  value="Enviar">
                        </div>
                        <div class="clearfix"></div>
                        <div class="new">
                            <p class="sign">iniciar sesion ? <a href="sesion.jsp">Login</a></p>
                            <div class="clearfix"></div>                                
                        </div>
                        <label id="mensaje">{mensaje}</label>
                    </form>                  
                </div>
            </div>
        </div>
        <!--//login-top-->
        <!--//login-->
        <!--footer section start-->
        <div class="footer">
            <div class="error-btn">
                <a class="read fourth" href="index.html">Home</a>
            </div>
            <p>&copy 2016 Augment . All Rights Reserved | Design by </p>
        </div>
        <!--footer section end-->
        <!--/404-->
        <!--js -->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>