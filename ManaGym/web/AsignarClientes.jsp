<%-- 
    Document   : AsignarClientes
    Created on : May 23, 2017, 7:14:00 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANAGYM</title>
    </head>
    <body>
        <ul class="nav">
                <li><a href="GestionarUsuarios.jsp">GESTION DE USUARIOS</a></li>
                <li><a href="AsignarClientes?accion=Ingresar">ASIGNAR CLIENTES</a></li> 
                <li><a href="GestionarMaquinas.jsp">GESTION DE MAQUINAS</a></li>
            </ul>
        <br>
         <br>
          <br>
        
        <br>
        <form name="form2" action="AsignarClientes">
            <h3>Asignación de Clientes a Instructor</h3>
            <label>Elija un instructor</label>
            <br>
            <select name="lstInstructores">
                <c:forEach var="instructor" items="${instructores}">
                    <option value=${instructor.getIdInstructor()}>
                        ${instructor.getNombre()}
                    </option>
                </c:forEach>
            </select>
            <br>
            <label>Elija los clientes a asociar</label>
            <br>
            <select name="lstClientes" multiple>
                <c:forEach var="cliente" items="${clientes}">
                    <option value=${cliente.getId()}>
                        ${cliente.getNombre()}
                    </option>
                </c:forEach>
            </select>
            <input type="submit" id="btnAsignarClientes" name="accion" value="Asociar"/>
        </form>
    </body>
</html>
