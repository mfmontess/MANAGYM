<%-- 
    Document   : GestionarUsuarios
    Created on : 18/04/2017, 10:53:45 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANAGYM</title>
        <style type="text/css">
            body {
                 background-image: url(imgfondos/maquinas.jpg);     
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
        <h3>Gestionar Usuarios</h3>
        <form name="form2" action="GestionarUsuariosControlador">
            <h3>Elija el perfil del usuario:</h3>
            <input type="checkbox" id="chkInstructor" name="perfil" value="2"/>
            <label>Instructor</label>
            <input type="checkbox" id="chkCliente" name="perfil" value="1"/>
            <label>Cliente</label>
            <label>Estado</label>
            <select name="lstEstado">
                <option value="1" >Activo</option>
                <option value="2" >Inactivo</option>
            </select>
            <input type="submit" id="btnBuscar" name="accion" value="Buscar"/>
            <br>
            <% if( request.getParameter("accion") != null){
            %>            
            <br>
            <div id="usuarios" style="width:300px; height:200px; overflow: scroll;">                
                <select name="lstUsuarios" multiple>
                    <c:forEach var="usuario" items="${usuarios}">
                        <option value=${usuario.getId()}>
                            ${usuario.toString()}
                        </option>
                     </c:forEach>
                </select>
                <br>
                <label>Marque la acción a realizar:</label>
                <select name="lstAccion">
                    <option value="1" >Activar</option>
                    <option value="2" >Inactivar</option>
                </select>
                <br>
                <input type="submit" id="btnGestionarUsuario" name="accion" value="Gestionar"/>
                </div>
            <%}%>
            ${mensaje}
        </form>
    </body>
</html>
