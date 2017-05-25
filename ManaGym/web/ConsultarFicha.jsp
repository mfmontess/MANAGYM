
<%@page import="java.util.Iterator.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="User" scope="session" class="Managym.Usuario"/>


<!DOCTYPE HTML>
<html>
    <head>
        <title>Managym</title>
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
        <script src="js/amcharts.js"></script>	
        <script src="js/serial.js"></script>	
        <script src="js/light.js"></script>	
        <script src="js/radar.js"></script>	
        <link href="css/barChart.css" rel='stylesheet' type='text/css' />
        <link href="css/fabochart.css" rel='stylesheet' type='text/css' />
        <!--clock init-->
        <script src="js/css3clock.js"></script>
        <!--Easy Pie Chart-->
        <!--skycons-icons-->
        <script src="js/skycons.js"></script>

        <script src="js/jquery.easydropdown.js"></script>

        <!--//skycons-icons-->
    </head> 
    <body>
        <div class="page-container">
            <!--/content-inner-->
            <div class="left-content">
                <div class="inner-content">
                    <!-- header-starts -->
                    <div class="header-section">
                        <!--menu-right-->
                        <div class="top_menu">
                            <!--/profile_details-->
                            <div class="profile_details_left">
                                <ul class="nofitications-dropdown">
                                    <li class="dropdown note dra-down">
                                        <script type="text/javascript">

                                            function DropDown(el) {
                                                this.dd = el;
                                                this.placeholder = this.dd.children('span');
                                                this.opts = this.dd.find('ul.dropdown > li');
                                                this.val = '';
                                                this.index = -1;
                                                this.initEvents();
                                            }
                                            DropDown.prototype = {
                                                initEvents: function () {
                                                    var obj = this;

                                                    obj.dd.on('click', function (event) {
                                                        $(this).toggleClass('active');
                                                        return false;
                                                    });

                                                    obj.opts.on('click', function () {
                                                        var opt = $(this);
                                                        obj.val = opt.text();
                                                        obj.index = opt.index();
                                                        obj.placeholder.text(obj.val);
                                                    });
                                                },
                                                getValue: function () {
                                                    return this.val;
                                                },
                                                getIndex: function () {
                                                    return this.index;
                                                }
                                            }

                                            $(function () {

                                                var dd = new DropDown($('#dd'));

                                                $(document).click(function () {
                                                    // all dropdowns
                                                    $('.wrapper-dropdown-3').removeClass('active');
                                                });

                                            });

                                        </script>
                                    </li>

                                    <div class="clearfix"></div>	
                                </ul>
                            </div>
                            <div class="clearfix"></div>	
                            <!--//profile_details-->
                        </div>
                        <!--//menu-right-->
                        <div class="clearfix"></div>
                    </div>
                    <!-- //header-ends -->
                    <div class="outter-wp">
                        <!--Cuerpo-->
                        <form name="form4" action="FichaMedicaControlador">
                            <br>
                            <br>
                            <br>
                            <br>
                            <br>
                            <fieldset>
                                <legend>FICHA MEDICA</legend>
                                <table>
                                    <tr>
                                        <td>Id Ficha:</td>
                                        <td><input type="text" name="IdFicha" value="${fichamedica.idficha}"></td>
                                    </tr>
                                    <tr>
                                        <td>Altura:</td>
                                        <td><input type="text" name="Altura" value="${fichamedica.altura}"></td>
                                    </tr>
                                    <tr>
                                        <td>Peso:</td>
                                        <td><input type="text" name="Peso" value="${fichamedica.peso}"></td>
                                    </tr>
                                    <tr>
                                        <td>Contorno Brazo:</td>
                                        <td><input type="text" name="ContornoBrazo" value="${fichamedica.contornoBrazo}"></td>
                                    </tr>
                                    <tr>
                                        <td>Contorno Pecho:</td>
                                        <td><input type="text" name="ContornoPecho" value="${fichamedica.contornoPecho}"></td>
                                    </tr>
                                    <tr>
                                        <td>Contorno Cintura:</td>
                                        <td><input type="text" name="ContornoCintura" value="${fichamedica.contornoCintura}"></td>
                                    </tr>
                                    <tr>
                                        <td>Contorno Pantorrilla:</td>
                                        <td><input type="text" name="ContornoPantorrilla" value="${fichamedica.contornoPantorrilla}"></td>
                                    </tr>
                                    <tr>
                                        <td>Contorno Muslo:</td>
                                        <td><input type="text" name="ContornoMuslo" value="${fichamedica.contornoMuslo}"></td>
                                    </tr>
                                    <tr>
                                        <td>Ancho Espalda:</td>
                                        <td><input type="text" name="AnchoEspalda" value="${fichamedica.anchoEspalda}"></td>
                                    </tr>
                                    <tr>
                                        <td>Fecha de Actualizacion:</td>
                                        <td><input type="text" name="FechaActualizacion" value="${fichamedica.fechaActualizacion}"></td>
                                    </tr>
                                    <tr>
                                        ${mensaje4}
                                    </tr>
                                    <tr>
                                        <td><input type="submit" value="Modificar" name="accion"></td>
                                        <td><input type="submit" value="Eliminar" name="accion"></td>
                                        <td><input type="submit" value="Regresar" name="accion"></td>
                                    </tr>
                                </table>
                            </fieldset>
                        </form>
                        <!--//Cuerpo-->
                    </div>
                    <!--footer section start-->

                    <!--footer section end-->
                </div>
            </div>
            <!--//content-inner-->
            <!--/sidebar-menu-->
            <!--Menu-->
            <%@ include file="menu.jsp" %>  
            <!--Fin Menu-->
            <div class="clearfix"></div>		
        </div>
        <script>
            var toggle = true;

            $(".sidebar-icon").click(function () {
                if (toggle)
                {
                    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
                    $("#menu span").css({"position": "absolute"});
                } else
                {
                    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
                    setTimeout(function () {
                        $("#menu span").css({"position": "relative"});
                    }, 400);
                }

                toggle = !toggle;
            });
        </script>
        <!--js -->
        <link rel="stylesheet" href="css/vroom.css">
        <script type="text/javascript" src="js/vroom.js"></script>
        <script type="text/javascript" src="js/TweenLite.min.js"></script>
        <script type="text/javascript" src="js/CSSPlugin.min.js"></script>
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>