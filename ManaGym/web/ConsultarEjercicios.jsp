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
              body {
                 background-image: url(imgfondos/fit.jpg); 
                }
                h1 {
                    color: black;
                    font-family: fantasy;
                    text-align: center;
                }
                
                 td{
                color: floralwhite;
                font-family: fantasy;
            }
                legend {
                    color: navy;
                    font-family: fantasy;
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
      <h1>MANAGYM</h1>
        <br>
        <br>
        <form name="form1" action="Ejerciciocontrolador">
            <fieldset>
                <legend>EJERCICIOS</legend>
            <table>
                <tr>
                    <td>Id Ejercicios:</td>
                    <td> <input type="text" name="IdEjercicio" value=${Ejercicios.IdEjercicio}></td>
                </tr>
                <tr>
                    <td>Nombre Ejercicios:</td>
                    <td> <input type="text" name="NombreEjercicio" value=${Ejercicios.NombreEjercicio} size="40"></td>
                </tr>
                <tr>
                    <td>Descripcion Ejercicios:</td>
                    <td> <input type="text" name="DescripcionEjercicio" value=${Ejercicios.DescripcionEjercicio} size="40"></td>
                </tr>
                <tr>
                    <td>Video Ejercicios:</td>
                    <td> <input type="text" name="VideoEjercicio" value=${Ejercicios.VideoEjercicio} size="40"></td>
                </tr>
                <tr>
                ${mensaje}
                </tr>
                <tr>
                    <td><input type="image" src="imgiconos/modificar.png" value="Modificar" name="accion"></td>
                    <td><input type="image" src="imgiconos/eliminar.png" value="Eliminar" name="accion"></td>
                    <td><input type="image" src="imgiconos/deshacer.png" value="Regresar" name="accion"></td>
                </tr>
            </table>
                </fieldset>
        </form>
    </body>
</html>
