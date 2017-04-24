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
        <title>Gestion de Usuarios</title>
    </head>
    <body>
        <form name="form2" action="GestionarUsuariosControlador">
            <h3>Elija el perfil del usuario:</h3>
            <input type="checkbox" id="chkCliente" />
            <label>Cliente</label>        
            <input type="checkbox" id="chkInstructor" />
            <label>Instructor</label>
            <input type="submit" id="btnBuscar" name="accion" value="Buscar"/>
            
            <br>
            <label>Elija el usuario...</label>
            <% if( request.getParameter("accion") != null){
            %>            
            <br>
            <div id="usuarios" style="width:300px; height:200px; overflow: scroll;">                
                <select name="usuarios" multiple>
                    <c:forEach var="cliente" items="${clientes}">
                        <option value=${cliente.getIdentificacion()}>
                            ${cliente.toString()}
                        </option>
                     </c:forEach>
                </select>
                <!--<img src="imgiconos/users.png" title="${clientes.get(0).toString()}" />-->
            </div>
            <%}%>   
            <br>
            <label>Marque la opción:</label>
            <select name="lstAccion">
                <option value="1" >Habilitar</option>
                <option value="2" >Deshabilitar</option>
            </select>
            <br>
            <input type="submit" id="btnGestionarUsuario" name="accion" value="Gestionar"/>
        </form>
    </body>
</html>
