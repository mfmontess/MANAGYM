<div class="sidebar-menu">
                <header class="logo">
                    <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="index.html"> <span id="logo"> <h1>ManaGYM</h1></span> 
                        <!--<img id="logo" src="" alt="Logo"/>--> 
                    </a> 
                </header>
                <div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
                <!--/down-->
                <div class="down">	
                    <a href="inicio.jsp"><img src="images/admin.jpg"></a>
                    <a href="inicio.jsp"><span class=" name-caret">${sessionScope.User.nombreUsuario}</span></a>
                    
                    <ul>
                        
                        <li><a class="tooltips" href="sesion.jsp"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>
                    </ul>
                </div>
                <!--//down-->
                <div class="menu">
                    <ul id="menu" >
                        <li><a href="inicio.jsp"> <i class="lnr lnr-book"></i><span>Inicio</span></a></li>
                        <li id="menu-academico" ><a href="#"><i class="lnr lnr-book"></i> <span>Usuarios</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul id="menu-academico-sub" >
                                <li id="menu-academico-avaliacoes" ><a href="GestionarUsuarios.jsp">Gestionar Usuarios</a></li>
                                <li id="menu-academico-avaliacoes" ><a href="GestionarFicha.jsp">Administrar ficha medica clientes</a></li> 
                                <li id="menu-academico-boletim" ><a href="AsignarClientes?accion=Ingresar">Asignar Usuarios</a></li>
                                <li id="menu-academico-boletim" ><a href="AsignaRutinas.jsp">Asignar Rutinas</a></li>
                            </ul>
                        </li>
                        <li id="menu-academico" ><a href="GestionarMaquinas.jsp"><i class="lnr lnr-book"></i> <span>Gestionar Maquinas</span></a></li>
                        <li id="menu-academico" ><a href="#"><i class="lnr lnr-book"></i> <span>Gestion</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul id="menu-academico-sub" >
                                <li id="menu-academico-avaliacoes" ><a href="GestionarEjercicios.jsp">Gestionar Ejercicios</a></li>
                                <li id="menu-academico-boletim" ><a href="Rutinacontrolador?accion=Ingresar">Gestionar Rutinas</a></li>
                                <li id="menu-academico-boletim" ><a href="register.html">Gestionar Asistencia Clientes</a></li>
                            </ul>
                        </li>
                        <li><a href="inicio.jsp"> <i class="lnr lnr-book"></i><span>Ver Rutinas y Actividades</span></a></li>
                     </ul>
                </div>
            </div>