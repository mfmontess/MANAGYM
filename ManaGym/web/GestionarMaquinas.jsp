<%-- 
    Document   : GestionarMaquinas
    Created on : 18/04/2017, 10:54:08 PM
    Author     : lenovo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                 background-image: url(imgfondos/images.jpg);     
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
        <form name="form2" action="Maquinascontrolador">
            <fieldset>
                <legend>FORMULARIO REGISTRO MAQUINA</legend>
            <table>
                 <br>
                <tr>
                    <td>Id Maquina:</td> 
                    <td><input type="text" name="IdMaquina"></td>
                </tr>
                <tr>
                    <td>Nombre Maquina:</td> 
                    <td><input type="text" name="NombreMaquina"></td>
                </tr>
                <tr>
                    <td>Estado Maquina:</td> 
                    <td><input type="text" name="EstadoMaquina"></td>
                </tr>
                <tr>
                    <td>Caracteristicas Maquina:</td> 
                    <td><input type="text" name="Caracteristicas"></td>
                </tr>
                <tr>
                    <td><input type="submit" src="imgiconos/guardar.png" value="Guardar" name="accion"></td> 
                    <td><input type="submit" src="imgiconos/buscar.png" value="Consultar" name="accion"></td>
                </tr>
            </table>
            </fieldset>
        </form>
    </body>
</html>
<%-- 
    Document   : Inicio
    Created on : 9/11/2016, 04:17:56 PM
    Author     : lenovo
--%>

