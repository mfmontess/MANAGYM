/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import BD.UsuarioDAO;
import java.util.ArrayList;

import Managym.Usuario;

public class UsuarioServicio {

    private static UsuarioServicio instance;

    public UsuarioServicio() {
    }

    public static UsuarioServicio getInstance() {
        if (null == instance) {
            instance = new UsuarioServicio();
        }
        return instance;
    }

    public Usuario IngresarSistema(String usuario, String contraseña) throws Exception {
        return UsuarioDAO.getInstance().Ingresar(usuario, contraseña);
    }

    public boolean insertar(Usuario U) throws Exception {
        return UsuarioDAO.getInstance().InsetarUsuarios(U);
    }

}
