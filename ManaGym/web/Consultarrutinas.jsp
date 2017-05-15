<%-- 
    Document   : Consultarrutinas
    Created on : 14/05/2017, 06:47:05 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANAGYM RUTINAS</title>
        <style>
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
                   td{
                color: black;
                font-family: fantasy;
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
        <h1>MANAGYM</h1>
        <br>
        <br>
        <form name="form3" action="Rutinacontrolador">
            <fieldset>
                <legend>RUTINAS</legend>
                <table>
                    <tr>
                    <td>Id Rutina:</td>
                    <td> <input type="text" name="idrutina" value=${rutina.idrutina}></td>
                </tr>
                    <tr>
                    <td>Nombre Rutina:</td>
                    <td> <input type="text" name="nombrerutina" value=${rutina.nombrerutina}></td>
                </tr>
                    <tr>
                    <td>Descripcion:</td>
                    <td> <input type="text" name="descripcion" value=${rutina.descripcion}></td>
                </tr>
                  <tr>
                    <td>Tiempo de Duracion:</td>
                    <td> <input type="text" name="tiempodeduracion" value=${rutina.tiempodeduracion}></td>
                </tr>
                 <tr>
                  ${mensaje3}
                </tr>
                 <tr>
                     <td><input type="submit" value="Modificar" name="accion"</td>
                     <td><input type="submit" value="Eliminar" name="accion"</td>
                     <td><input type="submit" value="Regresar" name="accion"</td>
                </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
