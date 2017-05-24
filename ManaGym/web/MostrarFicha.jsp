<%-- 
    Document   : MostrarFicha.jsp
    Created on : 17/05/2017, 06:37:16 PM
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
        <form name="form4" action="FichaMedicaControlador">
            <fieldset>
                <table>
                    <legend>FICHA MEDICA</legend>
                    <tr>
                        <td>Id Ficha:</td>
                        <td><input type="text" name="IdFicha" value="${fichamedica.idFicha}"></td>
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
                        <td>Ancho Espalda:</td>
                        <td><input type="text" name="AnchoEspalda" value="${fichamedica.anchoEspalda}"></td>
                    </tr>
                    <tr>
                        <td>Contorno Brazo:</td>
                        <td><input type="text" name="Contorno Brazo" value="${fichamedica.contornoBrazo}"></td>
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
                        <td>Fecha de Actualizacion:</td>
                        <td><input type="text" name="FechaActualizacion" value="${fichamedica.fechaActualizacion}"></td>
                    </tr>
                    <tr>
                        <td>Id Cliente:</td>
                        <td><input type="text" name="idcliente" disabled="false" value="${cliente.idcliente}"></td>
                    </tr>
                    <tr>
                       ${mensaje4}
                    </tr>
                    <tr>
                        <td><input type="submit" value="Regresar" name="accion"></td>
                    </tr>
               </table>
            </fieldset>
        </form>
    </body>
</html>
