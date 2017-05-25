<%-- 
    Document   : AsignaRutinas
    Created on : 23/05/2017, 10:20:15 PM
    Author     : lenovo
--%>

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
        <form name="form10" action="AsignarRutinasControlador">
          <br>
          <br>
           <br>
            <br>
             <br>
             <h1>ASIGNAR RUTINAS</h1>
             <table>
               <tr>
                    <td>
                        CLIENTES:
                    </td>
                    <td>
                        <select name="usuario1" class="default">
                            <option value="" selected>Seleccionar</option>
                            <c:forEach items="${Usuario}" var="cliente">
                                <option value="${Usuario.id}">${Usuario.nombreUsuario}</option>
                            </c:forEach>
                        </select>
                    </td>
                    <td>
                       RUTINAS:
                    </td>
                    <td>
                        <select name="rutina1" class="default">
                            <option value="" selected>Seleccionar</option>
                            <c:forEach items="${Rutina}" var="rutina">
                                <option value="${Rutina.id}">${Rutina.nombrerutina}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr> 
                <tr>
                    <td><input type="submit"   value="AsignarRutinas" name="accion" >
                       
                </tr>  
             </table>
        </form>
        
    </body>
</html>
