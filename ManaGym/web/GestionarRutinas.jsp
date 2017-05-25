<%-- 
    Document   : GestionarRutinas
    Created on : 18/04/2017, 10:54:38 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Rutinas</title>
        <style type="text/css">
                h1 {
                    color: black;
                    font-family: fantasy;
                    text-align: center;
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
            td{
                color: black;
                font-family: fantasy;
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
                <li><a href="GestionarFicha.jsp">ADMINISTRAR FICHA MEDICA</a></li>                  
            </ul>
        <br>
          <br>
           <br>
            <br>
             <br>
        <h1>Gestion de Rutinas</h1>
        <form name="form3" action="Rutinacontrolador">
            <fieldset>
                <legend>FORMULARIO REGISTRO RUTINA</legend>
                <table>
                    <br
                        <tr>        
                           <td>Id Rutina: </td>
                           <td><input type="text" name="idrutina"></td>
                        </tr>
                    <br>
                        <tr>        
                           <td>Nombre Rutina: </td>
                           <td><input type="text" name="nombrerutina" value="Rutina" size="40"></td>
                        </tr>
                    <br>
                        <tr>        
                           <td>Descripcion : </td>
                           <td><input type="text" name="descripcion" value="Rutina" size="40"></td>
                        </tr>
                    <br>    
                        <tr>        
                           <td>Tiempo de Duracion: </td>
                           <td><input type="text" name="tiempodeduracion" value="Rutina" size="40"></td>
                        </tr>                    
                        <tr>
                            <td>ASOCIAR EJERCICIO</td>
                            <td>
                                <select name="ejercicio1" class="default">
                                    <option value="" selected>Seleccionar</option>
                                    <c:forEach items="${ejercicios}" var="ejercicio"> 
                                        <option value="${ejercicio.getIdejercicio()}">${ejercicio.getNombreEjercicio()}</option>
                                    </c:forEach>
                                </select>
                            </td>
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
