/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Managym.Usuario;
import Servicios.DBManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class UsuarioBD extends DBManager{
    private UsuarioBD(){
    }
    public static UsuarioBD mgr = new UsuarioBD();
    
    @Override
    protected void addObject(ArrayList x, ResultSet rs) {
        x.add(new Usuario(rs)); 
    }
    
    public ArrayList getUsuarios (String perfil){
        ArrayList x = ejecutarQuery("select * from usuarios where IdPerfil="+perfil+" ");
        return x;
    }

    public void updateEstado(String usuario, int estado) {
        execute("update usuarios set IdEstado = " + estado + " where IdUsuario = " + usuario);
    }

    public void insert(Usuario usuario) {
        execute("insert into usuarios (NombreUsuario,ContrasenaUsuario,IdPerfil,IdEstado) values ('" + usuario.getUsuario() +"','" + usuario.getContraseña() + "'," + usuario.getPerfil().getId() + ",2)");
    }    
}
