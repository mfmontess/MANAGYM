<div class="sidebar-menu">
                <header class="logo">
                    <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="index.html"> <span id="logo"> <h1>BogoTravel</h1></span> 
                        <!--<img id="logo" src="" alt="Logo"/>--> 
                    </a> 
                </header>
                <div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
                <!--/down-->
                <div class="down">	
                    <a href="index.html"><img src="images/admin5.jpg"></a>
                    <a href="index.html"><span class=" name-caret">${sessionScope.persona.nombres} </span></a>
                    <p>Sistema de administración</p>
                    <ul>
                        <li><a class="tooltips" href="perfil.jsp"><span>Perfil</span><i class="lnr lnr-user"></i></a></li>
                       
                        <li><a class="tooltips" href="cerrar_sesion.jsp"><span>Log out</span><i class="lnr lnr-power-switch"></i></a></li>


                    </ul>
                </div>
                <!--//down-->
                <div class="menu">
                    <ul id="menu" >
                        <li><a href="CargarMapaInicio"><i class="fa fa-tachometer"></i> <span>Inicio</span></a></li>
                        <li id="menu-academico" ><a href="#"><i class="fa fa-user"></i> <span> Usuarios</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul id="menu-academico-sub" >
                                <li id="menu-academico-avaliacoes" ><a href="CrearUsuario.jsp">Crear usuario</a></li>
                               
                                <li id="menu-academico-avaliacoes" ><a href="TraerUsuarios">Gestionar usuarios</a></li>

                            </ul>
                        </li>
                        <li id="menu-academico" ><a href="#"><i class="fa fa-file-text-o"></i> <span>Sitios de interes</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul id="menu-academico-sub" >
                                <li id="menu-academico-avaliacoes" ><a href="CrearSitioInteres.jsp">Crear Sitio</a></li>
                                <li id="menu-academico-boletim" ><a href="validation.html">Editar sitio</a></li>
                                <li id="menu-academico-boletim" ><a href="table.html">Ver sitios</a></li>
                                <li id="menu-academico-boletim" ><a href="table.html">Calificar sitios</a></li>

                            </ul>
                        </li>

                        <li id="menu-academico" ><a href="#"><i class="lnr lnr-pencil"></i> <span>Reportes Inseguridad</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                            <ul id="menu-academico-sub" >
                                <li id="menu-academico-avaliacoes" ><a href="login.html">Crear Reportes</a></li>
                                <li id="menu-academico-boletim" ><a href="register.html">Editar Reportes</a></li>
                                <li id="menu-academico-boletim" ><a href="404.html">Ver Reportes</a></li>

                            </ul>
                        </li>
                        
                        
                       
                        
                    </ul>
                </div>
            </div>