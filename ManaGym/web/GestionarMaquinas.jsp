

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANAGYM</title>
        <script src="js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("input[name=IdMaquina]").change(function(){
                    $("input[value=Consultar]").click();
                });
                $("input[value=Eliminar]").click(function(){
                        var str = "Desea eliminar la máquina ";
                        confirm(str.concat($('input[name=IdMaquina]').val()));
                });
            });
        </script>
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
        <ul class="nav">
                <li><a href="AsignarClientes?accion=Ingresar">ASIGNAR CLIENTES</a></li> 
                <li><a href="GestionarMaquinas.jsp">GESTION DE MAQUINAS</a></li>
            </ul>
        <h1>MANAGYM</h1>
        <br>
         <br>
          <br>
        
        <br>
        <form name="form2" action="Maquinascontrolador">
            <fieldset>
                <legend>FORMULARIO GESTIÓN MAQUINA</legend>
            <table>
                 <br>
                <tr>
                    <td>Código Máquina:</td> 
                    <td><input type="text" name="IdMaquina" value=${maquina.idMaquina}></td>
                </tr>
                <% if(request.getSession().getAttribute("maquina") != null){ %>
                <tr>
                    <td>Nombre:</td> 
                    <td><input type="text" name="NombreMaquina" value=${maquina.nombreMaquina}></td>
                </tr>
                <tr>
                    <td>Estado:</td>
                    <td><input type="text" name="EstadoMaquina" value=${maquina.estadoMaquina}></td>
                </tr>
                <tr>
                    <td>Caracteristicas:</td> 
                    <td><input type="text" name="Caracteristicas" value=${maquina.caracteristicas}></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Guardar" name="accion"></td> 
                    <td><input type="submit" value="Eliminar" name="accion"></td>
                </tr>
                <%}%>
                ${mensaje}
            </table>
            <input type="submit" value="Consultar" name="accion" style="display: none;">
            </fieldset>
        </form>
    </body>
</html>

