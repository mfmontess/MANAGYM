<%-- 
    Document   : GestionarEjercicios
    Created on : 18/04/2017, 10:54:24 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <script type="text/jscript" > 
        </script>
        <style type="text/css">
            body {
                 background-image: url(imgfondos/fitness29.jpg);     
                }
                h1 {
                    color: black;
                    font-family: fantasy;
                    text-align: center;
                }
                td{
                color: black;
                font-family: fantasy;
            }
                legend {
                    color: black;
                    font-family: monospace;
                    font-size: 30px;
                  }
                    *{
               padding: 0px;
               margin: 0px;
               
            }
            #header{
                margin: auto;
                width: 600px;
                font-family: Arial,Helvetica,sans-serif;
            }
            ul,ol{
                list-style: none;
            }  
            .nav li a{
                background-color: black;
                color: white;
                text-decoration: none;
                padding: 10px 15px;
                display: block;
            }
            .nav li a:hover{
                background-color:#434343; 
            }
            .nav > li{
                float: left;
            }
            .nav li ul{
                display:none; 
                position: absolute;
                min-width: 140px;
            }
            .nav li:hover > ul{
                display: block;
            }
        </style>
    </head>
    <body>
        
            <ul class="nav">
                <li><a href="GestionarEjercicios.jsp">GESTION DE EJERCICIOS</a></li> 
                <li><a href="GestionarMaquinas.jsp">GESTION DE MAQUINAS</a></li>
                <li><a href="GestionarRutinas.jsp">GESTION DE RUTINAS</a></li>
                <li><a href="GestionarUsuarios.jsp">GESTION DE USUARIOS</a></li>
                    
            </ul>
         <br>
          <br>
           <br>
            <br>
             <br>
        <h1>MANAGYM</h1>
        <br>
         <br>
          <br>
        
        <br>
        <form name="form2" action="Ejerciciocontrolador">
            <fieldset>
                <legend>FORMULARIO INGRESO DE EJERCICIOS</legend>
            <table>
                 <br>
                <tr>
                    <td>Id Ejercicio:</td> 
                    <td><input type="text" name="IdEjercicio"></td>
                </tr>
                <tr>
                    <td>Nombre Ejercicio:</td> 
                    <td><input type="text" name="NombreEjercicio"></td>
                </tr>
                <tr>
                    <td>Descripcion Ejercicio:</td> 
                    <td><input type="text" name="DescripcionEjercicio"></td>
                </tr>
                <tr>
                    <td>Video Ejercicio:</td> 
                    <td><input type="text" name="VideoEjercicio"></td>
                </tr>
                <tr>
                    <td><input type="image"  src="imgiconos/deshacer.png" value="Limpiar" name="accion">
                    <td><input type="image" src="imgiconos/guardar.png" value="Guardar" name="accion" ></td> 
                    <td><input type="image" src="imgiconos/buscar.png" value="Consultar" name="accion"></td>
                </tr>
            </table>
            </fieldset>
        </form>
    </body>
</html>
