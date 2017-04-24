<%-- 
    Document   : GestionarRutinas
    Created on : 18/04/2017, 10:54:38 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Rutinas</title>
    </head>
    <body>
        <h1>Gestion de Rutinas</h1>
        <labe>Nombre: </labe>
        <input type="text" id="txtNombreRutina" />
        <select name="lstEjercicios">
            <c:forEach items="${ejercicios}" var="ejercicio">
                <option value="${ejercicio.getIdEjercicio()}">${ejercicio.getNombreEjercicio()}</option>
            </c:forEach>
        </select>
    </body>
</html>
