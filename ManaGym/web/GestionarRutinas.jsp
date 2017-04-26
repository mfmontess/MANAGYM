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
    </head>
    <body>
        <h1>Gestion de Rutinas</h1>
        <form name="form2" action="GestionarRutinasControlador">
            <label>Nombre: </label>
            <input type="text" id="txtNombreRutina" />
            
            <br>
            <label>Series: </label>
            <input type="text" id="txtSeries" />
            <br>
            <input type="submit" id="btnAdicionarEjercicio" name="accion" value="Adicionar Ejercicio"/>
            <% if( request.getParameter("accion") != null){
            %>
            <div>
                <label>Ejercicios: </label>
                <br>
                <br>
                <select name="lstEjercicios">
                    <c:forEach items="${ejercicios}" var="ejercicio">
                        <option value="${ejercicio.getIdEjercicio()}">${ejercicio.getNombreEjercicio()}</option>
                    </c:forEach>
                </select>
                <label>Repeticiones: </label>
                <input type="text" id="txtRepeticiones" />
                <input type="submit" id="btnAdicionarEjercicio" name="accion" value="Adicionar"/>
            </div>
            <%}%>
            
            <br>
            <input type="submit" id="btnGestionarRutinas" name="accion" value="Gestionar"/>
        </form>
    </body>
</html>
