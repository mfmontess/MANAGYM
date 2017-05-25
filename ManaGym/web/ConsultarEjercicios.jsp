<%-- 
    Document   : ConsultarEjercicios
    Created on : 23/04/2017, 07:49:44 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <form name="form2" action="Ejercicioscontrolador">
            <fieldset>
                <legend>EJERCICIOS</legend>
            <table>
                <tr>
                    <td>Id Ejercicio:</td>
                    <td> <input type="text" name="idejercicio" value=${ejercicio.idejercicio}></td>
                </tr>
                <tr>
                    <td>Nombre Ejercicio:</td>
                    <td> <input type="text" name="nombreejercicio" value=${ejercicio.nombreejercicio}></td>
                </tr>
                <tr>
                    <td>Descripcion Ejercicio:</td>
                    <td> <input type="text" name="descripcionejercicio" value=${ejercicio.descripcionejercicio}></td>
                </tr>
                <tr>
                    <td><a href="${ejercicio.videoejercicio}" target="_blank">URL Video Ejercicio</a></td>
                </tr>
                <tr>
                ${mensaje}
                </tr>
                <tr>
                    <td><input type="submit"  value="Modificar" name="accion"></td>
                    <td><input type="submit"  value="Eliminar" name="accion"></td>
                    <td><input type="submit"  value="Regresar" name="accion"></td>
                </tr>
            </table>
                </fieldset>
        </form>
    </body>
</html>
