<%-- 
    Document   : GestionarFicha
    Created on : 16/05/2017, 09:18:15 PM
    Author     : lenovo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
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
                <li><a href="AdministrarFiicha.jsp">ADMINISTRAR FICHA MEDICA</a></li>                  
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
        <form name="form4" action="FichaMedicaControlador">
            <fieldset> 
                <legend> FORMULARIO REGISTRO FICHA MEDICA</legend>
                <table>
                    <br>
                    <tr>
                        <td>Id Ficha:</td>
                        <td><input type="text" name="IdFicha"></td>
                    </tr>
                    <tr>
                        <td>Altura:</td>
                        <td><input type="text" name="Altura"></td>
                    </tr>
                    <tr>
                        <td>Peso:</td>
                        <td><input type="text" name="Peso"></td>
                    </tr>
                    <tr>
                        <td>Ancho Espalda:</td>
                        <td><input type="text" name="AnchoEspalda"></td>
                    </tr>
                    <tr>
                        <td>Contorno Brazo:</td>
                        <td><input type="text" name="ContornoBrazo"></td>
                    </tr>
                    <tr>
                        <td>Contorno Cintura:</td>
                        <td><input type="text" name="ContornoCintura"></td>
                    </tr>
                    <tr>
                        <td>Contorno Muslo:</td>
                        <td><input type="text" name="ContornoMuslo"></td>
                    </tr>
                    <tr>
                        <td>Contorno Pantorrilla:</td>
                        <td><input type="text" name="ContornoPantorrilla"></td>
                    </tr>
                    <tr>
                        <td>Contorno Pecho:</td>
                        <td><input type="text" name="ContornoPecho"></td>
                    </tr>
                    <tr>
                        <td>Fecha de Actualizacion:</td>
                        <td><input type="text" name="FechaActualizacion"></td>
                    </tr>
                    <tr>
                        <td>Id Cliente:</td>
                        <td><input type="text" name="idcliente" disabled="false" value=${cliente.idcliente}></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Limpiar" name="accion"></td>
                        <td><input type="submit" value="Guardar" name="accion"></td>
                        <td><input type="submit" value="Consultar" name="accion"></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
