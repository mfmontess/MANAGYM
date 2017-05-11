
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
              body {
                 background-image: url(imgfondos/descarga.jpg); 
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
        <form name="form1" action="Maquinascontrolador">
            <fieldset>
            <table>
                <legend>MAQUINAS</legend>
                
                    <tr>
                        <td>Id Maquina</td>
                        <td><input type="text" name="IdMaquina" value=${maquina.IdMaquina}></td>
                    </tr>
                     <tr>
                        <td>Nombre Maquina</td>
                        <td><input type="text" name="NombreMaquina" value=${maquina.NombreMaquina}></td>
                    </tr>
                     <tr>
                          <tr>
                    <td>Estado Maquina:</td> 
                    <td><input type="text" name="EstadoMaquina" value=${maquina.EstadoMaquina}></td>
                </tr>
                <tr>
                    <td>Caracteristicas Maquina:</td> 
                    <td><input type="text" name="Caracteristicas" value=${maquina.Caracteristicas}></td>
                </tr>
                <tr>
                ${mensaje}
                </tr>
                    <tr>
                        <td><input type="image" src="imgiconos/deshacer.png" value="Regresar" name="accion"></td>
                    </tr>
            </table>
                
                </fieldset>
        </form>
    </body>
</html>
